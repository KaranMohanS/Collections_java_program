/*VECTOR 
  1.EMPTY METHOD
  2.CAPACITY METHOD
  3.CONTAINS ALL METHOD
  4.ELEMENT AT METHOD
  5.EQUALS METHOD
  6.TO STRING METHOD
  7.HASHCODE METHOD
 */
import java.util.*;
public class EXAMPLE{
    public static void main(String[] args) {
        Vector numbers=new Vector();
                               //EMPTY METHOD
        System.out.println("empty --->"+numbers.isEmpty());
        numbers.add("k");
        numbers.add("a");
        numbers.add("r");
        numbers.add("a");
        numbers.add("n");
        numbers.add("m");
        numbers.add("o");
        numbers.add("h");
        numbers.add("a");
        numbers.add("n");

        System.out.println(numbers);
                                                        //CAPACITY METHOD
      System.out.println("capacity is -->"+numbers.capacity());
                                                       //COTAINS ALL METHOD
      System.out.println("contains all --->"+numbers.containsAll(numbers));
                                                       //ELEMENT AT METHOD
      System.out.println("element at --->"+numbers.elementAt(5));
                                                      //EQUALS METHOD
      System.out.println("equals --->"+numbers.equals("a"));
                                                      //TO STRING METHOD
      System.out.println("to string --->"+numbers.toString());
                                                     //IS EMPTY METHOD
      System.out.println("empty --->"+numbers.isEmpty());
                                                     //HASH CODE METHOD
      System.out.println("hashcode --->"+numbers.hashCode());
      
    }
}
