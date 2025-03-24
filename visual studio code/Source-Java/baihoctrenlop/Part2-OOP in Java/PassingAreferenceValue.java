public class PassingAreferenceValue{
	public static void main(String[] args){
		Holder h = new Holder();
		h.held = 100;
		h.bump(h);
		System.out.println(h.held);
	}	
}

class Holder{
	public int held;
	public void bump(Holder theHolder){
		theHolder.held++;
	}

}