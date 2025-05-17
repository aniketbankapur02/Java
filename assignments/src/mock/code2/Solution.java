package code2;
import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Region> r = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int rid = sc.nextInt();
            sc.nextLine();
            String rName = sc.nextLine();
            int nPol = sc.nextInt();
            sc.nextLine();
            List<Pol> pol = new ArrayList<>();
            for (int j = 0; j < nPol; j++) {
                String polName = sc.nextLine();
                String party = sc.nextLine();
                int votes = sc.nextInt();
                sc.nextLine();
                Pol p = new Pol(polName, party, votes);
                pol.add(p);
            }
            Region r2 = new Region(rid, rName, nPol, pol);
            r.add(r2);
        }
        Service s = new Service();

        try {
            s.maxVotes(r);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        s.maxVotesRegion(r);
        sc.close();
    }
}

class Service {
    void maxVotes(List<Region> L) throws NegVote {
        for (Region region : L) {
            int maxVotes = 0;
            String polName = null;
            boolean equal = false; 
            for (Pol pol : region.l) {
                if (pol.votes < 0) {
                    throw new NegVote("Alert");
                }
                if (pol.votes > maxVotes) {
                    maxVotes = pol.votes;
                    polName = pol.pname;
                }else if (maxVotes == pol.votes) {
                    equal = true;
                }       
            }
            if (!equal) {
                System.out.println(region.rName +" with id " +region.rid + " = " + polName);
                
            }
            if (equal) {
                System.out.println("No single politician found with maximum");
            }
        }    
    }
    void maxVotesRegion(List<Region> L) {
        int maxVotes = 0;
        String regName = null;
        boolean equal = false;
        for (Region region : L) {
            int sumVotes = 0; 
            for (Pol pol : region.l) {
                if (pol.votes<0) {
                    System.out.println("alert");
                    return;
                }
                sumVotes += pol.votes;
            }
            if (sumVotes > maxVotes) {
                maxVotes = sumVotes;
                regName = region.rName;
                equal = false;
            }else if (sumVotes == maxVotes) {
                equal = true;
            }       
            
        }
        if (!equal) {
            System.out.println("Region with maximum votes " + maxVotes+ " = " + regName);
        }else{
            System.out.println("No region found with maximum votes.");
        }
    }


    
}

class Region  {
int rid;
String rName;
int noPol ;
List<Pol> l ;

Region  (
int rid,
String rName,
int noPol,
List<Pol> l){
this.rid = rid;
this.rName = rName;
this.noPol = noPol;
this.l = l;
}
    
}

class Pol {
String pname;
String PartyName;
int votes;

Pol (
String pname,
String PartyName,
int votes
){
this.pname = pname;
this.PartyName = PartyName;
this.votes = votes;
}
    
}

class NegVote extends Exception {

    public NegVote(String message){
        super(message);
    }
    
}


