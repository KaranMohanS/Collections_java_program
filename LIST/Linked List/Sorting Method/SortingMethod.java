
import java.util.*;
public class Sortingarraylist {

    public static void main(String[] args) {
    LinkedList numbers = new LinkedList<>();
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

    System.out.println("before numbers :"+ numbers);
             
                             //SORTING MRTHOD
    Collections.sort(numbers);

    System.out.println("after sorting :"+numbers);

    
                            //SORTING ALPHABET

        LinkedList<String> names = new LinkedList();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Names : " + names);

        // Sort an ArrayList using its sort() method. You must pass a Comparator to the ArrayList.sort() method.
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });

        // The above `sort()` method call can also be written simply using lambda expression
        names.sort((name1, name2) -> name1.compareTo(name2));

        // Following is an even more concise solution
        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names : " + names);
    }


}