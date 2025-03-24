public class Programm3 {

	public static void main(String args[]) {
		Console x = new Console();
		x.print("Type in the ammount to pay:");
		int topay = x.readInt();
		x.print("Type in the ammount given by customer :");
		int ammount = x.readInt();
		int change = ammount - topay;
		x.println("Give "+(change/5000)+" of 5000");
		change = change%5000;
		x.println("Give "+(change/1000)+" of 1000");
		change = change%1000;
		x.println("Give "+(change/500)+" of 500");
		change = change%500;
		x.println("Give "+(change/100)+" of 100");
		change = change%100;
		x.println("Give "+(change/50)+" of 50");
		change = change%50;
		x.println("Give "+(change/10)+" of 10");
		change = change%10;
		x.println("Give "+(change/5)+" of 5");
		change = change%5;
		x.println("Give "+(change)+" of 1");
	}
}