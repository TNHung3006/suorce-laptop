// file ExampleException.java
public class ExampleException 
{
    public void copy(String fileName1, String fileName2) 
					        throws MyException 
    {
        if (fileName1.equals(fileName2)) 
           throw new MyException("File trung ten"); // tung ngo?i l?

        System.out.println("Copy completed");
    }

    public static void main(String[] args) 
    {
           ExampleException obj = new ExampleException();
           try {
	        String a = args[0];
	        String b = args[1];
	        obj.copy(a,b);
           } catch (MyException e) {
	        System.out.println(e.getMessage());
           }
    }
}
