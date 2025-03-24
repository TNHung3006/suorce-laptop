import java.awt.Point;

public class MyArray 
{
    public static void main(String[ ] args) {
          System.out.println("Goi phuong thuc methodeX()");
          methodeX();
          System.out.println("Chuong trinh ket thuc binh thuong");
    }
    
    public static void methodeX()  {

        Point[ ] pts = new Point[10];
		for(int i = 0; i < pts.length ; i++)  {
	     	 pts[i] = new Point();
             pts[i].x = i;
             pts[i].y = i+1;
	     //pts[i] = new Point(i,i+1);
        }
	
    }
}
