

public class Cau14 {
    public static void main(String[] args) {
        //Pattern 1
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }  
        //Pattern 2
        for(int i = 6; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        } 
        //Pattern 3
        for(int i = 1; i <= 6; i++){
            for(int k = 6; k > i; k--){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        //Pattern 4 
        for(int i = 6; i >= 1; i--){
            for(int j = 6; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        } 
    }
}
