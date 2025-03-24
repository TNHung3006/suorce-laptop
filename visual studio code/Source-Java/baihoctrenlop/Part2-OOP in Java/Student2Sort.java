/*
 * Sap xep mang sinh vien
 */
import java.util.*;
class Student2Sort
{
	public static void main (String s[])
    {
    	Student2 st[]=new Student2[5];
    	st[0]=new Student2("Vy",27);
    	st[1]=new Student2("Hoa",17);
    	st[2]=new Student2("Nam",21);
    	st[3]=new Student2("Loan",22);
    	st[4]=new Student2("Anh",25);
    	Arrays.sort(st);
    	System.out.println ("The sorted students by age:");
    	for (int i = 0; i<st.length; i++)
    		System.out.println (st[i].name +"\t"+st[i].age);
    }
}
class Student2 implements Comparable
{
	String name;
	int age;
	Student2 (String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public int compareTo(Object o)
	{
		Student2 st=(Student2) o;
		if (age<st.age)
			return -1;
		else
			if (age>st.age )
				return 1;
			else
				return 0;
	}
	
}
