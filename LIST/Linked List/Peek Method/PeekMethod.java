/* PEEK METHOD
  1.PEEKFIRST METHOD
  2.PEEKLAST METHOD
*/

import java.util.*;
public class PeekMethod {
    public static void main(String[] args) {
        
        LinkedList topcompanys=new LinkedList();
        topcompanys.add("TATA");
        topcompanys.add("INFSYS");
        topcompanys.add("WIPRO");
        topcompanys.add("ZOHO");

        System.out.println("top companys ="+ topcompanys);
        
                                                                //PEEKFIRST METHOD
        System.out.println("First company ="+ topcompanys.peekFirst());
                                                                //PEEKLAST METHOD
        System.out.println("Last company ="+ topcompanys.peekLast());
    }

    
}
