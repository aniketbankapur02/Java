package call_by_value_of_reference;



public class code1
{
	public static void main(String[] args) {
	    
	    String name = "person1";

    //    nmae[1]  = '1'; not possible in java string are immutable in c++ it is possible and in c++ string are stored in heap
    //in java string are stores in heap in special area string pool 
	    
	   // char string[] = "121212";
	    
	    String name1[] = {"person1","person3"};
	    name1[1] = "person2";
	    
	    System.out.println(name1[1]);
	    
	   // Main ref_var = new Main();
	   // ref_var.change(name1);
	   
	   code1.change(name1);
	    
		System.out.println(name1[1]);
	}
	
static	void change(String copy[]){
	    
	    copy[1] = "person2334";
	   // System.out.println(copy[1]);
	    
	}
}
