public class BubbleSort {
   // swap: interchange inside array
   static void swap(int[] a, int i, int j) {
      int t = a[i];
      a[i] = a[j];
      a[j] = t;
   }

   // bubbleSort: very short code, but ineffient
   static void bubbleSort(int[] a) {
      for (;;) {
         boolean sorted = true;
         for (int i = 0; i < a.length - 1; i++)
            if (a[i] > a[i+1]) {
               sorted = false;
               swap(a, i, i + 1);
            }
         if (sorted) break;
      }
   }

   static void printArray(int[] a) {
      for (int i = 0; i < a.length; i++) {
         if (i%8 == 0) System.out.println();
         System.out.print(a[i] + " \t");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      int size = Integer.parseInt(args[0]);
      System.out.println("Bubblesort, size = " +
         size);
      int[] r = new int[size];
      for (int i = 0; i < size; i++)
         r[i] = (int)(Math.random()*size*10 + 1);
      long startTime =System.currentTimeMillis();
      bubbleSort(r);
      System.out.println("Elapsed time(millis) "+
         (System.currentTimeMillis()-startTime));
      printArray(r);
   }
}
