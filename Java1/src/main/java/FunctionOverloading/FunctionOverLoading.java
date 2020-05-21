package FunctionOverloading;

public class FunctionOverLoading {
	
	//in function over laoding either the argument count should be different or the data type of the argument should be different
	
	
	public void GetData(int i)
	{
		System.out.println(i);
		
	}
	public void GetData(String a)
	{
		System.out.println(a);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionOverLoading fo =new FunctionOverLoading();
		fo.GetData(10);
		fo.GetData("Hello");
	}

}
