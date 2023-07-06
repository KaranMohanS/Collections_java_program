/*SEARCHING ELEMENT
  1.CONTAIN() METHOD
  2.INDEXOF() METHOD
  3.LASTINDEXOF() METHOD
 */

import java.util.*;
public class SearchingMethod {
    public static void main(String[] args) {
    LinkedList programmingLanguages = new LinkedList<>();
    programmingLanguages.add("C");
    programmingLanguages.add("C++");
    programmingLanguages.add("JAVA");
    programmingLanguages.add("PYTHON");
    programmingLanguages.add("HTML");
    programmingLanguages.add("XML");
    programmingLanguages.add("PHP");
    programmingLanguages.add("JSON");
    System.out.println("languages :"+programmingLanguages);

                                                                      //CONTAIN METHOD
    System.out.println("languages c :"+programmingLanguages.contains("c"));
    System.out.println("languages C :"+programmingLanguages.contains("C"));
                                                                      //CONTAIN ALL METHOD
    System.out.println("All languages :"+programmingLanguages.containsAll(programmingLanguages));
    
                                                                       //INDEXOF METHOD
    System.out.println("Index of c :"+programmingLanguages.indexOf("c"));
    System.out.println("Index of C :"+programmingLanguages.indexOf("C"));
    System.out.println("Index of php :"+programmingLanguages.indexOf("PHP"));
    System.out.println("Index of java :"+programmingLanguages.indexOf("JAVA"));
     
                                                                    //LASTINDEX METHOD
    System.out.println("Last Index :"+programmingLanguages.lastIndexOf("JSON"));
    System.out.println("Last Index :"+programmingLanguages.lastIndexOf("PYTHON"));
    
    


       
    
}
}
