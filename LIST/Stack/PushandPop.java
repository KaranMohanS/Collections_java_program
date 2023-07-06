/*1.PUSH METHOD
  2.POP METHOD
  3.SIZE METHOD
  4.PEEK METHOD
  5.SEARCH METHOD
 */

import java.util.*;
public class PushandPop {
    public static void main(String[] args) {
        Stack numbers=new Stack<>();
                               //PUSH METHOD
        numbers.push("k");
        numbers.push("a");
        numbers.push("r");
        numbers.push("a");
        numbers.push("n");
        numbers.push("m");
        numbers.push("o");
        numbers.push("h");
        numbers.push("a");
        numbers.push("n");

        System.out.println(numbers);

                            //POP METHOD
        numbers.pop();
        System.out.println(numbers);
        System.out.println("poped element -->"+ numbers.pop());
        System.out.println(numbers);
                                       //SEARCH METHOD
        System.out.println("searching -->"+numbers.search("k"));
                                       //SIZE METHOD
        System.out.println("stack size -->"+numbers.size());
                                        //SEARCH METHOD
        System.out.println("searching -->"+numbers.search("N"));
                                        //PEEK METHOD
        System.out.println("peek -->"+numbers.peek());
        


    }
}
