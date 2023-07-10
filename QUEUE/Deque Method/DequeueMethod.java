import java.util.*; 
public class DequeueMethod {
    public static void main(String[] args) {  
    Deque<Integer> obj=new ArrayDeque<Integer>();{
                                         //ADD METHOD
        System.out.println("adding queue");
        obj.add(4);                                //FIFO
        obj.add(2);
        obj.add(2);
        obj.add(3);
        obj.add(1);
        System.out.println(obj);
        System.out.println("peek first --->"+obj.peekFirst());
        System.out.println("peek last --->"+obj.peekLast());
        System.out.println(obj);
        System.out.println(obj.offer(1));

        System.out.println("get first --->"+obj.getFirst());
        System.out.println("get last --->"+obj.getLast());

        System.out.println("push element");
        obj.push(10);
        System.out.println(obj);

        System.out.println("pop element --->"+obj.pop());
        System.out.println(obj);

        System.out.println("poll first --->"+obj.pollFirst());
        System.out.println("poll last --->"+obj.pollLast());

        System.out.println(obj);

        System.out.println("size of queue --->"+obj.size());

    
}
}
}
