public class Swapping {
   // swap: pass references to objects
   static void swap(MyInteger rWrap, MyInteger sWrap) {
      // interchange values inside objects
      int t = rWrap.getValue();
      rWrap.insertValue(sWrap.getValue());
      sWrap.insertValue(t);
   }

   public static void main(String[] args) {
      int a = 23, b = 47;
      System.out.println("Before. a:" + a + ", b: " + b);
      MyInteger aWrap = new MyInteger(a);
      MyInteger bWrap = new MyInteger(b);
      swap(aWrap, bWrap);
      a = aWrap.getValue();
      b = bWrap.getValue();
      System.out.println("After.  a:" + a + ", b: " + b);
   }
}

// MyInteger: similar to Integer, but can change value
class MyInteger {
   private int x;                   // single data member
   public MyInteger(int xIn) { x = xIn; } // constructor
   public int getValue() { return x; }  // retrieve value
   public void insertValue(int xIn) { x = xIn;} // insert
}