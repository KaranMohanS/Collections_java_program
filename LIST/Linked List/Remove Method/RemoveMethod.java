/* REMOVING ELEMENT
  1.REMOVE(INT,INDEX) METHOD
  2.REMOVE(OBJECT 0) METHOD
  3.REMOVE ALL() METHOD
  4.CLEAR() METHOD
  5.REMOVEFIRST METHOD
  6.REMOVELAST METHOD
*/

import java.util.*;
public class Removeelement {
    public static void main(String[] args) {
        LinkedList cars=new LinkedList<>();

        cars.add("BMW");
        cars.add("AUDI");
        cars.add("TOYOTA");
        cars.add("LAMBORGHINI");
        cars.add("JEEP");
        cars.add("FORD");
        System.out.println("CARS list  :"+ cars);

                                                    //REMOVE INDEX BASED
        System.out.println("remove index based :"+ cars.remove(4));   
        System.out.println(cars);   
                                                  
                                                   //REMOVE OBJECT BASED

        System.out.println("remove object based :"+ cars.remove("FORD"));   
        System.out.println(cars);   

        LinkedList cars1=new LinkedList();           //REMOVE ALL METHOD
         
         cars1.add("JEEP");
         cars1.add("FORD");
         cars1.removeAll(cars);
         System.out.println("modify cars list  : "+ cars1);  

                                                   //CLEAR METHOD
        cars1.clear();
        System.out.println("clear cars list"+cars1);  

        LinkedList cars2=new LinkedList();           //REMOVE ALL METHOD
         
         cars2.add("JEEP");
         cars2.add("FORD");
         cars2.removeAll(cars1);
         System.out.println("modify cars list  : "+ cars2);  

                                                     //REMOVEFIRST METHOD
         cars2.removeFirst();
         System.out.println(cars2);

                                                      //REMOVEFIRST METHOD
        cars2.removeLast();
         System.out.println(cars2);

}
}
