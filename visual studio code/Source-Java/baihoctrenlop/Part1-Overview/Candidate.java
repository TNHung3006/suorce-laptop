public class Candidate {
     String ten;
     int namsinh;
     float diemtoan,diemvan,diemanh;

     Candidate(String t, int ns, float dt, float dv, float da) {
 	   ten = t;
 	   namsinh = ns;
 	   diemtoan = dt;
 	   diemvan = dv;
 	   diemanh = da;
      }

      Candidate() { 
 	   ten = "H.V.T";
 	   namsinh = 1985;
 	   diemtoan = 0;
 	   diemanh = 0;
 	   diemvan = 0;
     }

     public String getName() {
		 	return ten;
     }

     public void setName(String x) {
	 	ten = x;
     }

     public int getYearBorn() {
       	return namsinh;
     }

     public void setYearBorn(int x) {
	 	namsinh = x;
     }

     public String show() {
 	   return "Ten: "+ten+"  Nam sinh: "+ namsinh+"  Diem Toan: "+ diemtoan+
 	   	" Diem Van: " + diemvan + " Diem Anh: " + diemanh ;
     }
     public float getSum(){
     	return diemtoan + diemvan + diemanh;
     }

 } 