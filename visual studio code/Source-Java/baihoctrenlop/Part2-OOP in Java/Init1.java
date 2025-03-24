class Init1{ 
   public static void main(String args[]){
    new Init2();	
  }

  Init1(){
    System.out.print("Init1");
  }


  //dong Init1(){..} lai va active Init1(String s){...}
  Init1(String s){
	System.out.print(s);
  }



}

class Init2 extends Init1{
  Init2(){
    //super();//ngam goi den Constructor cua lop cha	
    System.out.print("Init2");
 }
}

//Ket qua xuat ra Console se la Init1Init2
//Neu mot lop khong co' constructor thi` Java se cung cap cho lop mot
//constructor mac dinh (default constructor) khong co tham so va khong lam gi ca:
//thuoc tinh, bien cua lop se duoc khoi tao boi cac gia tri mac dinh:
//(so:0,boolean:false, kieu doi tuong:null)
//neu ta them super(); vao truoc System.out...trong Init2() thi kq van nhu vay!


//Neu lop Init1 khong co bat ky constructor nao thi ket qua se in ra la Init2
//Khoa' cac constructor trong Init1 lai=> kq la Init2 (luc nay java cung cap mot
//default construtor cho lop Init1)

//Chu y: neu ta da dinh nghia mot constructor bat ky nao cho mot class thi
//trinh bien dich se khong cung cap mot default constructor nua
//Neu khong co Init1(){System.out.print("Init1");} (khoa' constructor nay lai) thi
//se bi bao loi do khong tim thay constructor Init1(){...}
//=> them super("Init11") vao truoc System.out...trong Init2(){...} thi kq la Init11Init2