public class Phonebook {

	String[] names;  //we will have an array of strings
	int[] numbers;   //we will have an array of integers
	int next;	//where to put the next one
	int maximum;	//the maximum of names allowed

	Phonebook() {
		names = new String[1000];
		numbers = new int[1000];
		next = 0;
		maximum = 1000;
		//we have 1000 entries, from 0 to 999
	}
   
        Phonebook(int n) {
		names = new String[n];
		numbers = new int[n];
		next = 0;
		maximum = n;
		//we have capacity for n entries, from 0 to n-1
	}

	public void setEntry(String n, int t) {
		//we don't care if it gets full
		names[next] = n;
		numbers[next] = t;
		next = next +1;
	}

	public int getNumber(String n) {
		int i = 0;
		while (i < next) {
			if (names[i].equals(n)){
				return numbers[i]; //found and return
			}
		        i = i + 1;
		}
		return -1;  //it reaches this line if name wasnt there
	}
}
			