import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cau20 {
    public static int count(String str, char a){
        int n = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == a){
                n++;
            }
        }

        return n;
    }
    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao chuoi ki tu: ");
        String str = sc.nextLine();
        char x = str.charAt(3);
        System.out.println("So lan xuat hien ki tu " + x + " la: " + count(str, x));

        sc.close();
    }
    
}
