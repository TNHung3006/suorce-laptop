import pckage1.*;
public class SubClassInDifferentPackage extends SubclassInSamePackage {
	
	public int getZZZ(){
		return z;
	}
	
    public static void main(String args[]){
    	SubClassInDifferentPackage subClassDiffObj = new SubClassInDifferentPackage();
    	SubclassInSamePackage subClassObj = new SubclassInSamePackage();
    	//Access Modifiers - Public
    	System.out.println("Value of x is : "+subClassObj.x);
    	subClassObj.setX(30);
    	System.out.println("Value of x is : "+subClassObj.x);
    	
    	//Access Modifiers - Private
//    	If we remove the comments it would result in a compilaton 
//    	error as the fields and methods being accessed are private
    	
/*    	System.out.println("Value of y is : "+subClassObj.y);
    	subClassObj.setY(20);
    	System.out.println("Value of y is : "+subClassObj.y);*/
    	
    	//Access Modifiers - Protected
//    	If we remove the comments it would result in a compilaton 
//    	error as the fields and methods being accessed are protected.

/*    	System.out.println("Value of z is : "+subClassObj.z);
    	subClassObj.setZ(30);
    	System.out.println("Value of z is : "+subClassObj.z);*/
    	System.out.println("Value of z is : "+subClassDiffObj.getZZZ());
    	
    	
    	//Access Modifiers - Default
//    	If we remove the comments it would result in a compilaton 
//    	error as the fields and methods being accessed are default.
/*
    	System.out.println("Value of a is : "+subClassObj.a);
    	subClassObj.setA(20);
    	System.out.println("Value of a is : "+subClassObj.a);*/
    	
    }
}
