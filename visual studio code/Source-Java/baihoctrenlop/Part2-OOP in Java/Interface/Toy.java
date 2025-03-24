class Toy extends Goods implements Taxable
{
  int minimumAge;

  Toy( String des, double pr, int min)
  {
    super( des, pr );
    minimumAge  = min ;
  }

  void display()
  {
    super.display() ;
    System.out.println( "minimum age: " + minimumAge );
  }

  public double calculateTax()
  {
    return price * taxRate ;
  }
}
