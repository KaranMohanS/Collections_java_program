
/*ADDING ELEMENT
1.ADDING OBJECT BASED
2.ADDING INDEX BASED
3.ADD ALL METHOD
   *OBJECT BASED ADD(OBJECT O)
   *INDEX BASED  ADD(INT,INDEX)
4.ADDFIRST METHOD
5.ADDLAST METHODS
*/
import java.util.*;
public class AddMethod {
    
    public static void main(String[] args) {
    
        LinkedList bike=new LinkedList<>();
        bike.add("BMW");                     //ADDING OBJECT BASED
        bike.add("NS-200");
        bike.add("PULSER-220");
        bike.add("TVS-50");
        System.out.println("linkedlist  : "+ bike);

                                                //ADDING INDEX BASED

        bike.add(4,"xl-100");
        System.out.println("Arraylist  : "+ bike);


         LinkedList bike1=new LinkedList<>();       //ADD ALL METHOD
         
         bike1.add("NINJA-700");
         bike1.add("BMW");
         bike1.addAll(bike);
         System.out.println("Arraylist  : "+ bike1);  

/* 
         System.out.println("ADD ALL METHOD INDEX BASED");  //INDEX METHOD
         bike1.addAll(6, bike1);
         System.out.println("Arraylist  : "+ bike1);  
       */   
                                                           //ADDFIRST METHOD
        bike1.addFirst("maruthi");                                                 
        System.out.println(bike1);
                                                          //ADDLAST METHOD
        bike1.addLast("swift");                                                 
        System.out.println(bike1);



  }
}


