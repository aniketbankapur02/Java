package u1classworkunal;

import java.util.ArrayList;

/*
 https://www.youtube.com/watch?v=wZYxijH12ak&t=42s
 notes
 https://github.com/team-codebug/java-full-course-2025/blob/main/14.svg
 size vs capacity 
 size is size of array/string
 capacity memory allocation done in heap
 */
public class U9Sb {
 public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>(); // when it is declared if capacity is not given default capacity is given and ie 10
// list size is zero as list is empty as we have not allocated any value
    System.out.println(a);

    StringBuilder s = new StringBuilder(); // when it is declared given default capacity is given and ie 16
// char arraylist is empty size is zero as list is empty as we have not allocated any value
    System.out.println(s.capacity());

    //----------------------------------------------------------------
   StringBuilder s1 = new StringBuilder("hello"); // when it is declared default capacity is given and ie 16
   // even if we initilze string of size 5 + \0 ie size 6 capacity will be 16
   // if size comes close to 16 internally SB increase the capacity to (oldsize * 2 + 2)
   System.out.println(s1.capacity() + " " + s1.length());//capacity : 16 + 5, size of list : 5 
   
   
   s1.append("hello");
   System.out.println(s1.capacity() + " " + s1.length());//capacity : 16 + 5, size of list : 10 fine no need to increase capacity

   s1.append("hello");
   System.out.println(s1.capacity() + " " + s1.length());//capacity : 16 + 5, size of list : 15

   s1.append("hello hello hello ");
   System.out.println(s1.capacity() + " " + s1.length());//capacity : 16 + 5 + 15, size of list : 30
//--------------------------
// in blow case it happenning what i was expected but above something is happening differently
// 16 + 5 is being made making it 21 capacity
// need to exlore this later

// when it is declared default capacity is given and ie 16
   // even if we initilze string of size 5 + \0 ie size 6 capacity will be 16
   // if size comes close to 16 internally SB increase the capacity to (oldsize * 2 + 2)
StringBuilder sb = new StringBuilder(); 
System.out.println(sb.length()); // 0 
System.out.println(sb.capacity()); // 16 
sb.append("Hello"); 
System.out.println(sb.length()); // 5 
System.out.println(sb.capacity()); // 16 
sb.append("Hello"); 
sb.append("Hello"); 
sb.append("Hello"); 
System.out.println(sb.capacity());

 }   
}
