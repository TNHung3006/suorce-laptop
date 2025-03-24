import java.util.*;
public class BubbleSort{
	public static void main (String[] args) {
		int [] a = {1,5,15,2,35,16,90};
		bubbleSort(a);
		displayArray(a);
		
	}
	static void  bubbleSort(int array[]) {
		int min;
		for (int i = 0; i < (array.length -1); i++) {
			for (int j = i+1; j < array.length; j++) {
				if ( array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;					
				}
			}
		}
	}
	static void displayArray(int a[]){
		for(int i = 0; i <a.length; i++)
			System.out.print(a[i]+"          ");
	}
}