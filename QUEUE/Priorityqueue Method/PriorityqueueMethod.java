/*PRIORITYQUEUE
  1.ADD METHOD
  2.REMOVE METHOD
  3.OFFER METHOD
  4.SIZE METHOD
  5.PEEK METHOD
  6.ITERATOR METHOD
  7.POLL METHOD
  8.IS EMPTY METHOD
 */

import java.util.*; 
import java.util.PriorityQueue; 
public class PriorityqueueMethod {  
   public static void main(String[] args) {  
    PriorityQueue<Integer> obj=new PriorityQueue<Integer>();

    System.out.println("adding queue");
    obj.add(1);                                //FIFO
    obj.add(2);
    obj.add(2);
    obj.add(3);
    obj.add(4);

    System.out.println(obj);         //REMOVE METHOD
    System.out.println("remove --->"+obj.remove());
                                     //OFFER METHOD
    System.out.println("offer --->"+obj.offer(3));
                                     //SIZE METHOD
    System.out.println(obj.size());

                                      //PEEK METHOD
    System.out.println("peek --->"+obj.peek());
                                      //ITERATOR METHOD
    System.out.println("using iterator");
    Iterator it=obj.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
                                         //POLL METHOD
    System.out.println("poll --->"+obj.poll());
    System.out.println(obj);

                                        //IS EMPTY METHOD
    System.out.println("IS EMPTY --->"+obj.isEmpty());




   }
}   