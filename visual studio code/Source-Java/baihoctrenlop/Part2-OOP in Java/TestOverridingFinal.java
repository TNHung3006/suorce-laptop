class Test1
{
	public final void sri(String s)
		{
			System.out.println(s);
		}
}

public class TestOverridingFinal extends Test1{

/**
* @param args
*/

	/*
	public final void sri(String s)
	{
	System.out.println(s);
	}
	*/
	public final void sri()
	{
		System.out.println("sriTOVRF");
	}

	public final void sri(int i)
	{
		System.out.println("sri1");
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub

		Test1 t=new Test1();
		t.sri("sriTest1");

	}

} 