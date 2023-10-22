import java.util.Scanner;

public class StudentBMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalBMI b = new CalBMI();
		float w,h,bmi;
		b.fname = ("Nateetan");
		b.lname = ("Buaprasert");
		b.weight = 56;
		b.height = 165;
				
		//System.out.println(b.fname + " ");
		//System.out.println(b.lname);
		
		b.setname(b.fname, b.lname);
		bmi = b.calBMI(b.weight,b.height);
		
		System.out.println(b.bmi);
		b.standardBMI(bmi);
	}
	
}
