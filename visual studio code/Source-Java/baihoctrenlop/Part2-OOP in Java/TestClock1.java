class TestClock1 {
 	public static void main(String args[]) { 
		System.out.println("creating a new clock");
 		Clock a= new Clock();
 		int x = a.getHours();
        System.out.println("Hours in the clock: "+x);
 		System.out.println("setting a new hour");
 		a.setTime(10,30,00);
 		System.out.println("Time is now: "+    
                           a.getHours()+":"+ a.getMinutes()+":"+ a.getSeconds());                
        System.out.println("Again: "+a.getTime());
		Clock b = new Clock(15,30,20);
		System.out.println("Time is now: "+ b.getTime());    
 	}
 } 		 