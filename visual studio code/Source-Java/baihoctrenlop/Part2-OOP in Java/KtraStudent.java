/**
 * @(#)KtraStudent.java
 *
 *
 * @author 
 * @version 1.00 2008/8/21
 */

public class KtraStudent {
    private static final int MAX = 2;   
    public KtraStudent() {
    }
    public static void main(String[] args) {
        Student a[] = new Student[MAX];
        String ten,dc;
        int ns;
        Console con = new Console();
        for (int i=0;i<MAX;i++){
        	con.println("Nhap du lieu cho sinh vien thu "+(i+1));
        	con.print("Ten: "); ten = con.readLine();
        	
        	con.print("Dia chi: "); dc = con.readLine();
        	con.print("Nam sinh: "); ns = con.readInt();
        	a[i] = new Student(ten,dc,ns);
        }
        con.println("Danh sach sinh vien:");
        for (int i=0;i<MAX;i++)
        	con.println(a[i].show());
        
    }
}
