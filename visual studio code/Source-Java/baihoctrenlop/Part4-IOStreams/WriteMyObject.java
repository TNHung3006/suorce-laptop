// file WriteMyObject.java
import java.io.*;
public class WriteMyObject{
	public static void main(String[] args){
		try{
			FileOutputStream f = new FileOutputStream("student.dat");
			ObjectOutputStream oStream = new ObjectOutputStream(f);
			Student x = new Student("Bill Gates", 58);
			oStream.writeObject(x);
			oStream.close();
		} catch (IOException e) {
				System.out.println("Error IO file");
		}
		try {
			FileInputStream g = new FileInputStream("student.dat");
			ObjectInputStream inStream = new ObjectInputStream(g);
			Student y = (Student) inStream.readObject();
			System.out.println(y.toString());
			inStream.close();
		} catch(ClassNotFoundException e) {
			System.out.println("Class not found");
		} catch (IOException e) {
			System.out.println("Error IO file");
		}
	}
}

class Student implements Serializable{
	private String name;
	private int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		String ret = "My name is " + name + "\nI am " + age + " years old";
		return ret;
	}
}