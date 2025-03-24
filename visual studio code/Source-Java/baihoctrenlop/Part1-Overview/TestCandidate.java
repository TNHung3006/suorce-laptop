/**
 * @(#)TestCandidate.java
 *
 *
 * @author 
 * @version 1.00 2008/8/21
 */

public class TestCandidate {
	private static final int MAX = 3;
        
    /**
     * Creates a new instance of <code>TestCandidate</code>.
     */
    public TestCandidate() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Candidate a[] = new Candidate[MAX];
        String ten;
        int ns; float dt,dv,da;
        Console con = new Console();
        for (int i=0;i<MAX;i++){
        	con.println("Nhap du lieu cho sinh vien thu "+(i+1));
        	con.print("Ten: "); ten = con.readLine();
        	con.print("Nam sinh: "); ns = con.readInt();
        	con.print("Diem mon Toan: "); dt = con.readFloat();
        	con.print("Diem mon Van: "); dv = con.readFloat();
        	con.print("Diem mon Anh: "); da = con.readFloat();
        	       	
        	a[i] = new Candidate(ten,ns,dt,dv,da);
        }
        con.println("Danh sach sinh vien co tong diem > 15:");
        for (int i=0;i<MAX;i++)
        	if (a[i].getSum() > 15)
        		con.println(a[i].show());
    }
}
