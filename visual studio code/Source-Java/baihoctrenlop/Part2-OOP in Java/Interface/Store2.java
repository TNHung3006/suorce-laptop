public class Store2
{
  public static void main ( String[] args )
  {
    Taxable item1 = new Book ( "Emma", 24.95, "Austin" );
    Taxable item2 = new Toy  ( "Leggos", 54.45, 8 );

    System.out.println( "Tax on item 1 "+ item1.calculateTax() );
    System.out.println( "Tax on item 2 "+ item2.calculateTax() );

  }

}
