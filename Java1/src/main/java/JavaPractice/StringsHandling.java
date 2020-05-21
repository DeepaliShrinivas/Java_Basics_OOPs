package JavaPractice;

public class StringsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a object of string class
		
		String str1="If you can't go outside,GO INSIDE";
		
		//indexOf(string) is a method to 
		
		System.out.println(str1.indexOf("GO INSIDE"));
		
		//charAt(index)is a method to check which string is available at that index
		
		System.out.println(str1.charAt(24));
		
		
		//Palindrome or reversing the string
		
		String str2="madam";
		
		String str3="";
		
		for(int i=str2.length()-1;i>=0;i--)
		{
			str3 = str3 + str2.charAt(i);
			
		}
		
		System.out.println(str3);
		
		//checking the string 
		
		if(str3.contentEquals(str2)) {
			System.out.println("it is a Palindrome");
		
		}
		else
		{
			System.out.println("not a Palindrome");
		}
			
			

	}

}
