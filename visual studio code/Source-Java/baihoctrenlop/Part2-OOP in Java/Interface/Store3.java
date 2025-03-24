public class Store3
{
  public static void main ( String[] args )
  {
    Book    book ;
    Taxable tax = new Book ( "Emma", 24.95, "Austin" );

    book = (Book)tax;
    book.display();
    System.out.println( "Tax on item 1 "+ book.calculateTax() );
  }

}
