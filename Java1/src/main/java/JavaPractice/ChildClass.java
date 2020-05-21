package JavaPractice;

public class ChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating parent class object and using in this class");
		ParentClass pc= new ParentClass();
		
		pc.ValidateHeader(); //calling method using class object
		
       System.out.println(pc.ValidateHeader());  //printing the return value
	}

}
