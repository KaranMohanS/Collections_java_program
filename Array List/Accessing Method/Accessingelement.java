/* ACCESSING METHOD
  1.IS EMPTY MRTHOD
  2.SIZE() METHOD
  3.GET() METHOD
  4.SET() METHOD
  5.CLONE() METHOD
*/

import java.util.*;
public class Accessingelement {
    public static void main(String[] args) {
        ArrayList cars=new ArrayList();
                                                          //isEmpty() METHOD
        System.out.println("list empty? :"+ cars.isEmpty());

        cars.add("BMW");
        cars.add("AUDI");
        cars.add("TOYOTA");
        cars.add("LAMBORGHINI");
        cars.add("JEEP");
        cars.add("FORD");
        System.out.println("CARS list  :"+ cars);
                                                          //isEmpty() METHOD
        System.out.println("list empty? :"+ cars.isEmpty());

                                                          //size() METHOD
        System.out.println("cars list size :"+ cars.size());

                                                         //GET METHOD
        System.out.println("GET :"+ cars.get(3));

                                                         //SET() METHOD
        System.out.println("SET :"+ cars.set(4,"BUGATTI"));
        System.out.println("modify cars list : "+cars);

                                                         //CLONE METHOD
        cars.clone();
        System.out.println("clone in cars list ;"+cars);

                                                    





    
}
}
