

public class Cau11 {
    public static int Sont(int n){
        if(n < 2)return 0;
        for(int i=2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return 0;
        }    
        return 1;
        
    }
    public static void main(String args[]){
        int n = 2;
        int x = 0;
        while(n < 1000){
            if (Sont(n) == 1){
                System.out.print(n + " ");
                x++;
                if(x % 10 == 0) System.out.println();
            }
            n++;
        }
    }
}
