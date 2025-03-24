class Book  extends Goods implements Taxable
{
  String author;

  Book( String des, double pr, String auth)
  {
    super( des, pr );
    author  = auth ;
  }

  void display()
  {
    super.display() ;
    System.out.println( "author: " + author );
  }

  public double calculateTax()
  {
    return price * taxRate ;
  }
}
