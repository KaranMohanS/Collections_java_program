/*LINKEDHASHSET METHOD
  1.ALL METHOD
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet obj=new LinkedHashSet();
                                    //IS EMPTY METHOD
        System.out.println("empty -->"+obj.isEmpty());
                                    //ADD METHOD
        obj.add("karan");
        obj.add(21);                //ITS FOLLOWING INSERTION ORDER
        obj.add('S');
        System.out.println(obj);
                                   //CLONE METHOD
        obj.clone();
        System.out.println(obj);
                                   //CONTAIN METHOD
        System.out.println("cantain --->"+obj.contains("s"));
                                                             //CONTAIN ALL METHOD
        System.out.println("cantain all--->"+obj.containsAll(obj));
                                                 //SIZE METHOD
        System.out.println("size --->"+obj.size());
                                                 //TO STRING METHOD
        System.out.println("string --->"+obj.toString());
                                                //HASHCODE METHOD
        System.out.println("hashset --->"+obj.hashCode());

        LinkedHashSet obj1=new LinkedHashSet<>();
        obj1.add("sri");             //ADD ALL METHOD
        obj1.add(27);
        obj1.add('s');

        System.out.println("add all --->"+obj1.addAll(obj));
        System.out.println(obj1);
                                    //ITERATOR METHOD
        Iterator it=obj1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
                             //REMOVE METHOD
        obj1.remove('s');
        System.out.println(obj1);
                               //REMOVE ALL METHOD
        System.out.println(obj1.removeAll(obj));
        System.out.println(obj1);
        
                                        //EQUALS METHOD
        System.out.println("equals --->"+obj1.equals(27));
        System.out.println("equals --->"+obj1.equals(obj1));

                       //CLEAR METHOD
        obj1.clear();
        System.out.println(obj1);

        obj1.add("5");
        obj1.add("4");
        obj1.add("null");
        obj1.add("2");
        obj1.add("null");

        System.out.println(obj1);
        
        












    }
    
}
