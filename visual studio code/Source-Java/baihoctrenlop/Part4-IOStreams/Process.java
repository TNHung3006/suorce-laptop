import java.io.*;
import java.util.*;

class Process {

  static public void main (String args[]) throws IOException {
        BufferedReader prices, purchases;
        PrintWriter total;
        
        prices = new BufferedReader( new FileReader( "Products.txt" ));
        total = new PrintWriter( new FileWriter("Totals.txt"));
        
        String lin;
        while ((lin = prices.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(lin);
            String name = st.nextToken();
            String code = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            
            int totalvalue = 0, totalamount = 0;
            
            purchases = new BufferedReader(new FileReader("Sells.txt"));
            String lin2;
            lin2 = purchases.readLine();
            while (lin2 != null) {
                StringTokenizer st2 = new StringTokenizer(lin2);
                if (st2.hasMoreElements()){
                    String cod = st2.nextToken();
                    if ( cod.equals(code)) {
                        String temp = st2.nextToken();
                        int amount = Integer.parseInt(temp);
                        totalvalue = totalvalue + amount*value;
                        totalamount += amount;
                    }
                }
                lin2 = purchases.readLine();
            }
            purchases.close();
            total.println(name+" : "+totalamount+" : "+totalvalue);
        }
        prices.close();
        total.close();

  }
}


