public class TestWasedaStudent {
     public static void main(String args[]) {
         WasedaStudent  ws1,ws2;
         ws1 =new WasedaStudent("student1","Musashino-shi",1980);
         ws2 =new WasedaStudent("student2","Shinjuku-ku",1981);
         ws1.putNewMark(10);
	 ws1.putNewMark(5);
         ws1.putNewMark(4);
         ws2.putNewMark(5); 
         ws2.putNewMark(8);
         ws2.putNewMark(7);
         ws2.putNewMark(4);
	 System.out.print(ws1.show());	
         System.out.println(" -- Avg.: "+ws1.showAverage());
         System.out.print(ws2.show());
         System.out.println(" -- Avg.: "+ws2.showAverage());
      } 
} 