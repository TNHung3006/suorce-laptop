class Goods
{
  String description;
  double price;

  Goods( String des, double pr )
  {
    description = des;
    price       = pr;
  }

  void display()
  {
    System.out.println( "item: " + description +  " price: " + price );
  }
}
