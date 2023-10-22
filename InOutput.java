package javainoutput;
import java.util.Scanner;

public class InOutput {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String fname = " ";
		String lname = " ";
		char gender ;
		int age;
		float grade;
		
		System.out.println("Enter first name: ");
		fname = kb.next();
		System.out.println("Enter last name: ");
		lname = kb.next();
		System.out.println("Enter gender: ");
		gender = kb.next().charAt(0);
		System.out.println("Enter age: ");
		age = kb.nextInt();
		System.out.println("Enter grade: ");
		grade = kb.nextFloat();
		
		
		System.out.println("Name: " + fname+ " "+ lname);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Grade: " + grade);
	}
	
}
