import java.util.*;
public class Iteratingarraylist {
    public static void main(String[] args) {
    ArrayList numbers = new ArrayList();
    numbers.add(10);
    numbers.add(9);
    numbers.add(8);
    numbers.add(7);
    numbers.add(6);
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    numbers.add(11);

    System.out.println(numbers);

    Iterator<Integer> i=numbers.iterator();   //ITERATOR METHOD

    System.out.println("iterator");
    System.out.println(i.next());

    while(i.hasNext())
    {
    System.out.println(i.next());
    }
    
   
    
}
}
