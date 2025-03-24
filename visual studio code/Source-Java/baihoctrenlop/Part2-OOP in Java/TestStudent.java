public class TestStudent {
     public static void main(String args[]) { 
	  Student s1,s2;
	  s1= new Student();
      s2 = new Student("Simon","Santiago",1998);
      System.out.println(s1.show()); 
      System.out.println(s2.show()); 
 	  s1.setName("John Smith");
	  s1.setAddress("123 5th Ave. New York");
      String n = s2.getName();
	  s2.setName(n+" Baloian");
      s2.setAddress("Tupungato 9130 "+s2.getAddress()+" Chile");
      System.out.println(s1.show()); 
   	  System.out.println(s2.show()); 
   
    }
 } 