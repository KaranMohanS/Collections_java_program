/*PRIORITY BLOCKING QUEUE
  1.ADD METHOD
  2.ADD ALL METHOD
  3.DRAIN METHOD
  4.SIZE METHOD
 */
import java.util.*; 
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue; 
public class PriorityqueueMethod {  
   public static void main(String[] args) {  
    PriorityBlockingQueue<Integer> obj=new PriorityBlockingQueue<Integer>();
                                     //ADD METHOD
    System.out.println("adding queue");
    obj.add(4);                                //FIFO
    obj.add(2);
    obj.add(2);
    obj.add(3);
    obj.add(1);

    System.out.println(obj); 
                                           //ALL METHOD
    PriorityBlockingQueue obj1=new PriorityBlockingQueue();
    obj1.add(5);
    System.out.println("obj1 --->"+obj1);  
                                          //DRAIN METHOD
    System.out.println("drain to ===>"+obj.drainTo(obj1)); 
    System.out.println(obj);   
                                  
    PriorityBlockingQueue obj2=new PriorityBlockingQueue<>();
                                          //ADD ALL METHOD
    System.out.println("obj2 --->"+obj2.addAll(obj1)); 
    System.out.println("obj2 --->"+obj2);   
                                          //SIZE METHOD
    System.out.println("size --->"+obj2.size());  
    
   
   }
}
