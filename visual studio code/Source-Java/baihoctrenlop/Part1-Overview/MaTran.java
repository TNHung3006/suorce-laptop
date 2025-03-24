public class MaTran {
	public static void main(String[] args) {
		int[][] a = new int[4][5];
		//Nh?p ma tr?n
		for (int i = 0; i < a.length; i++) 
			for (int j = 0;j<a[i].length; j++) 
				a[i][j] = i + j;
		//In ma tr?n
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) 
				System.out.print(a[i][j] + "\t"); 
			System.out.println(); 
		}
	}
}

