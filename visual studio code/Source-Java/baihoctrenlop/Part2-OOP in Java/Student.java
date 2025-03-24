public class Student {
     String name, address;
     int yearBorn;
     Student(String x, String y, int z) {
 	   name = x; address = y; yearBorn = z; 
      }
     Student() { 
 	   name = "N.N."; address = "Tokyo"; yearBorn = 2000;
     }
     public String getName() {
		 	return name;
     }
     public void setName(String x) {
	 	name = x;
     }
     public String getAddress() {
		 	return address;
     }
     public void setAddress(String x) {
	 	address = x;
     }
     public int getYear() {
       	return yearBorn;
     }
     public void setYear(int x) {
	 	yearBorn = x;
     }
     public int age(int thisYear) {
      	return thisYear - yearBorn;
     }
     public String show() {
 	   return "Name: "+name+"  Address: "+ address+"  Year:"+yearBorn;
     }
 } 