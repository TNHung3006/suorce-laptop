public class Store
{

  public static void main ( String[] args )
  {
    Goods gd = new Goods( "bubble bath", 1.40 );
    Food  fd = new Food ( "ox tails", 4.45, 1500 );
    Book  bk = new Book ( "Emma", 24.95, "Austin" );
    Toy   ty = new Toy  ( "Legos", 54.45, 8 );

    gd.display();

    fd.display();

    ty.display();
    System.out.println("Tax is: " + ty.calculateTax() + "\n" );

    bk.display();
    System.out.println("Tax is: " + bk.calculateTax() + "\n" );

  }
}
