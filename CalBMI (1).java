
public class CalBMI {
	public String fname;
	public String lname;
	public float weight;
	public float height;
	public float bmi;
	
	public void setname( String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		
		System.out.println(this.fname + " ");
		System.out.println(this.lname);
	}
	public float calBMI(float weight, float height) {
		this.weight = weight;
		this.height = height/100;
		bmi = weight/(this.height*this.height);
				
		return bmi;	
		
	}
	public static void standardBMI(float bmi) {
		if (bmi<18.5) {
			System.out.println("skinny");
		}
		else if (bmi>=18.5 & bmi <= 22.9) {
			System.out.println("normal");
		}
		else if (bmi>=23 & bmi <= 24.9) {
			System.out.println("chubby");			
		}
		else if (bmi>=25 & bmi <= 29.9) {
			System.out.println("fat");			
		}
		else{
			System.out.println("dangerous!");			
		}
	}
		
}
	

