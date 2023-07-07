/*SORTEDSETH
  1.FIRST SET METHOD
  2.LAST SET METHOD
  3.HEADSET METHOD
  4.TAIL SET METHOD
 */
import java.util.SortedSet;  
import java.util.TreeSet;  
public class JavaSortedSetExample1 {  
   public static void main(String[] args) {  
       SortedSet set = new TreeSet();   
            // ADD METHOD
            set.add("Audi");  
            set.add("BMW");  
            set.add("Mercedes");  
            set.add("Baleno");  
            System.out.println("The list of elements is given as:");  
            for (Object object : set) {  
                System.out.println(object);  
                  }  
                                                                       //FIRST SET METHOD
           System.out.println("The first element is given as: " + set.first());     
                                                                       //LAST SET METHOD
           System.out.println("The last element is given as: " + set.last());  
                                                                                    //HEADSET METHOD
           System.out.println("The respective element is given as: " + set.headSet("Baleno"));  
                                                                                   //TAILSET METHOD
           System.out.println("The respective element is given as: " + set.tailSet("Audi"));  

           
   }    
}  
