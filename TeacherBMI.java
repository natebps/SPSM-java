import java.util.Scanner;

public class TeacherBMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalBMI b = new CalBMI();
		float w,h,bmi;
		b.fname = ("Kunha");
		b.lname = ("radchakot");
		b.weight = 78;
		b.height = 175;
				
		//System.out.println(b.fname + " ");
		//System.out.println(b.lname);
		
		b.setname(b.fname, b.lname);
		bmi = b.calBMI(b.weight,b.height);
		
		System.out.println(b.bmi);
		b.standardBMI(bmi);
	}
	
}
