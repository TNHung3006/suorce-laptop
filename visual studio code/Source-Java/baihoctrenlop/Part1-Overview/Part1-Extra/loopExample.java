import java.util.Scanner;
// User picks starting and ending value
public class loopExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count, limit;

        System.out.print("Enter initial value: ");
        count = scan.nextInt();

        System.out.print("Enter limit   value: ");
        limit = scan.nextInt();

        while (count <= limit)   // less-than-or-equal operator
        {
            System.out.println("count is: " + count);
            count = count + 1;
        }
        System.out.println("Done with the loop");
    }
}