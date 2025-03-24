import java.util.*;

public class Hash {

   public static void main(String args[]) {
       Hashtable h = new Hashtable();
       h.put("Leandro","1234567");
       h.put("Andrew","666666");
       h.put("Stephan","777777");
       h.put("Andrea", "8888888");
       String i = (String)(h.get("Andrea"));
       System.out.println("The phone number of Andrea is "+i);
      
       i = (String)(h.get("Andrew"));
       System.out.println("The phone number of Andrew es "+i);
       System.out.println("All phone numbers");
       Enumeration e = h.elements();
       while (e.hasMoreElements()) 
          System.out.println(e.nextElement());
       h.remove("Leandro");
       System.out.println("All telephone numbers");
       e = h.elements();
       while (e.hasMoreElements()) 
          System.out.println(e.nextElement());
   }
}