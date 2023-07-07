/*TREE SET
  1.ADD METHOD
  2.DESCENDING ITERATOR METHOD
  3.POLL FIRST METHOD
  4.POLL LAST METHOD
  5.SIZE METHOD
  6,COMPARATOR METHOD
  7.DESCENDING SET METHOD
  8.HASHCODE METHOD
  9.FIRST METHOD
  10.HIGHER METHOD
  11.LAST METHOD
  12.LOWER METHOD
 */
import java.util.*;  
public class JavaSortedSetExample1 {  
   public static void main(String[] args) {  
       TreeSet set = new TreeSet();   
            // ADD METHOD
            set.add("Audi");  
            set.add("BMW");  
            set.add("Mercedes");  
            set.add("Baleno");  
            System.out.println("The list of elements is given as:");  
            for (Object object : set) {  
                System.out.println(object);  
                  }  
                  System.out.println("decending order");
                                                       //ITERATOR DESCENDING METHOD
                  Iterator it=set.descendingIterator();
                  while(it.hasNext())
                  {
                    System.out.println(it.next());
                  }
                                                                    //POLL FIRST METHOD
                  System.out.println("poll first -->"+set.pollFirst());
                  System.out.println(set);
                                                                    //POLL LAST METHOD
                  System.out.println("poll last -->"+set.pollLast());
                  System.out.println(set);
                                                                    //SIZE METHOD
                  System.out.println("size -->"+set.size());
                                                                    //COMPARATOR METHOD
                  System.out.println("comparator -->"+set.comparator());
                                                                    //DESCENDIND SET METHOD
                  System.out.println("poll first -->"+set.descendingSet());
                                                                     //HASHCODE METHOD
                  System.out.println("hash code -->"+set.hashCode());
                                                                     //FIRST METHOD
                  System.out.println(" first -->"+set.first()); 
                                                                     //HIGHER METHOD
                  System.out.println("higher -->"+set.higher("BMW"));
                                                                    //LAST METHOD
                  System.out.println("last -->"+set.last());
                                                                    //LOWER METHOD
                  System.out.println("lower -->"+set.lower("Baleno"));


                

     }
   }
