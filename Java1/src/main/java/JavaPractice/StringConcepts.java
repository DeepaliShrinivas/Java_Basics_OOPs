package JavaPractice;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="hello"; // String object is defined in a literal way, it is called as String Literal
		
		String a1="hello"; // here java will not create a new memory for a1,it is pointing to the 'a' memory
		
		//concatenation method
		a1.concat("Hi");    //it will not work, because string are immutable
		System.out.println(a1);
		String c= a.concat("World");
		System.out.println(c);
		
		String b= new String ("hello"); // String object with string class
		
		
		//StringBuffer and StringBuilder classes
		
		StringBuffer sb = new StringBuffer("Welcome To Java");
		sb.append("Selenium");
		System.out.println(sb);
		sb.insert(15, " ");
		System.out.println(sb);
		sb.replace(0, 7, "Hello");
		System.out.println(sb);
		sb.delete(14, 22);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		
		
		
		
		
		
		
	}

}

