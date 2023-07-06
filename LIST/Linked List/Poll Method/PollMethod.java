/* POLL METHOD
  1.POLLFIRST METHOD
  2.POLLLAST METHOD
*/

import java.util.*;
public class PollMethod {
    public static void main(String[] args) {
        
        LinkedList topcompanys=new LinkedList();
        topcompanys.add("TATA");
        topcompanys.add("INFSYS");
        topcompanys.add("WIPRO");
        topcompanys.add("ZOHO");

        System.out.println("top companys ="+ topcompanys);
        
                                                                //POLLFIRST METHOD
        System.out.println("First company ="+ topcompanys.pollFirst());
         System.out.println(topcompanys);
        
                                                               //POLLLAST METHOD 
        System.out.println("Last company ="+ topcompanys.pollLast());
        System.out.println(topcompanys);

        
    }

    
}
