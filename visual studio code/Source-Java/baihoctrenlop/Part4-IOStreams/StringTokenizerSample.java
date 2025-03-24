import java.util.StringTokenizer;
public class StringTokenizerSample
{
    public static void main(String[] args)
    {
       StringTokenizer st =
                new StringTokenizer("Ngay ma\\i e|m di, bien nho ten em goi ve","\\ /,.|;\"");
 
        // get how many tokens inside st object
        System.out.println("tokens count: " + st.countTokens());
 
        // iterate st object to get more tokens from it
        while (st.hasMoreElements())
        {
            String token = st.nextElement().toString();
            System.out.println("token = " + token);
        }
 
        // split a date string using a forward slash as
        // delimiter
        st = new StringTokenizer("2005/12/15", "/");
        while (st.hasMoreElements())
        {
            String token = st.nextToken();
            System.out.println("token = " + token);
        }
    }
}