/** Returns a random ambiguous compliment. */
public class AmbiguousCompliment{

public static void main(String argr[]) {
    String result;   // The generated insult which will be returned
    int which = (int)(Math.random() * 4);  //  Should result in 0 to 3.
    
    switch (which) {
        case 0:  result = "You look so much better than usual.";
                 break;
        case 1:  result = "Your work is up to its usual standards.";
                 break;
        case 2:  result = "You're quite competent for so little experience.";
                 break;
        default: result = "Oops -- something is wrong with this code.";
    }
    System.out.println(result);
}

}
