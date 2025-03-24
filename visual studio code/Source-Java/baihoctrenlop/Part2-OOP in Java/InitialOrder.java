public class InitialOrder {
    public static String getAndPrint(String s){
	System.out.println(s);
	return(s);
    }
	
    public static void main(String args[]) {
        Son son = new Son();
	//System.out.println(son.getBack());
    }
}

    class Father{
	private String s1 = InitialOrder.getAndPrint("Father.s1");
	public Father(){
		InitialOrder.getAndPrint("Father.<init>");
	}
    }

    class Son extends Father{
	private String s1 = InitialOrder.getAndPrint("Son.s1");
	public Son(){
	   //super();
	   InitialOrder.getAndPrint("Son.<init>");
	}

	public String getBack(){
		return s1;
	}

    }		
	
    

