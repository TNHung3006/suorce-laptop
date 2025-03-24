public class Store4
{
   public static void main ( String[] args )
  {
    Goods   toy ;
    Taxable tax = new Toy ( "Building Blocks", 1.49, 6 );

    toy = (Toy)tax;
    toy.display();
    System.out.println( "Tax: "+ ((Taxable)toy).calculateTax() );
  }

/*
public static void main ( String[] args )
  {
    Goods   toy ;
    Taxable tax = new Toy ( "Building Blocks", 1.49, 6 );

    toy = (Goods)tax;
    toy.display();
    System.out.println( "Tax: "+ ((Toy)toy).calculateTax() );
  }

*/
}
