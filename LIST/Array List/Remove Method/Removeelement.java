/* REMOVING ELEMENT
  1.REMOVE(INT,INDEX) METHOD
  2.REMOVE(OBJECT 0) METHOD
  3.REMOVE ALL() METHOD
  4.CLEAR() METHOD
*/

import java.util.*;
public class Removeelement {
    public static void main(String[] args) {
        ArrayList cars=new ArrayList();

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

        ArrayList cars1=new ArrayList();           //REMOVE ALL METHOD
         
         cars1.add("JEEP");
         cars1.add("FORD");
         cars1.removeAll(cars);
         System.out.println("modify cars list  : "+ cars1);  

                                                   //CLEAR METHOD
        cars1.clear();
        System.out.println("clear cars list"+cars1);  

}
}
