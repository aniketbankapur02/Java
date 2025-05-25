package mock_revision.code2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Region> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int rId = Integer.parseInt(sc.nextLine());
            String rName = sc.nextLine();
            int nPol = Integer.parseInt(sc.nextLine());
            List<Pol> p = new ArrayList<>();
            for (int j = 0; j < nPol; j++) {
                String pName = sc.nextLine();
                String partyName = sc.nextLine();
                int votes = Integer.parseInt(sc.nextLine());
                Pol p2 = new Pol(pName, partyName, votes);
                p.add(p2);
            }
            Region l2 = new Region(rId, rName, nPol, p);
            l.add(l2);
        }
        Service s = new Service();
        try {
            s.findMaxPol(l);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            s.maxPeopleVotes(l);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Service {

    public void findMaxPol(List<Region> r) throws NegVotes{
        for (Region region : r) {
            int max = 0;
            String regName = null;
            int regId = 0;
            String pol = null;
            boolean check = false;
            for (Pol region2 : region.p) {
                if (region2.votes < 0) {
                    throw new NegVotes("Alert: Votes");
                }
                if (region2.votes > max) {
                    max = region2.votes;
                    regName = region.rName;
                    regId = region.rId;
                    pol = region2.pName;
                    check = false;
                }else if (max == region2.votes) {
                    check = true;        
                }
            }
            if (!check) {
                System.out.println(regName + " with id " + regId + " = " + pol);
            }else{
                System.out.println("No single politician found with maximum votes for " + region.rName);
            }
        }

    }

    public void maxPeopleVotes(List<Region> l) throws NegRegVotes{
        int maxV = 0;
        String regName = null;
        boolean tie = false;
        for (Region region : l) {
            int sum = 0;
            for (Pol region2 : region.p) {
                if (region2.votes < 0) {
                    throw new NegRegVotes("Alert: Votes of a certain region is negative.");
                }
                sum += region2.votes;
            }
            if (sum > maxV) {
                maxV = sum;
                regName = region.rName;
                tie = false;
            }else if (sum == maxV) {
                tie = true;
            }
        }
        if (!tie) {
            System.out.println("Region with " + maxV + " = " + regName);
        }else{
            System.out.println("No region with maximum votes.");
        }
    }
    
}


class Region {
int rId;
String rName;
int nPol;

List<Pol> p;

Region (
int rId,
String rName,
int nPol,
List<Pol> p)
{
this.rId = rId;
this.rName = rName;
this.nPol = nPol;
this.p = p;
}    
}
class Pol {
String pName;
String partyName;
int votes;

 Pol (
String pName,
String partyName,
int votes){
this.pName = pName;
this.partyName = partyName;
this.votes = votes;
}

    
}

class NegVotes extends Exception{
NegVotes(String message){
    super(message);
}
}
class NegRegVotes extends Exception{
NegRegVotes(String message){
    super(message);
}
    
}