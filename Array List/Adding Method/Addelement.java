/*ADDING ELEMENT
1.ADDING OBJECT BASED
2.ADDING INDEX BASED
3.ADD ALL METHOD
   *OBJECT BASED ADD(OBJECT O)
   *INDEX BASED  ADD(INT,INDEX)
*/
import java.util.*;
public class Addelement {
    
    public static void main(String[] args) {
    
        ArrayList bike=new ArrayList();
        bike.add("RX-100");                     //ADDING OBJECT BASED
        bike.add("NS-200");
        bike.add("PULSER-220");
        bike.add("TVS-50");
        System.out.println("Arraylist  : "+ bike);

                                                //ADDING INDEX BASED

        bike.add(4,"xl-100");
        System.out.println("Arraylist  : "+ bike);


         ArrayList bike1=new ArrayList();       //ADD ALL METHOD
         
         bike1.add("NINJA-700");
         bike1.add("BMW");
         bike1.addAll(bike);
         System.out.println("Arraylist  : "+ bike1);  


         System.out.println("ADD ALL METHOD INDEX BASED");  //INDEX METHOD
         bike1.addAll(6, bike1);
         System.out.println("Arraylist  : "+ bike1);  



  }
}


