package InheritanceConcept;

public class State extends Country{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		State s= new State();
		s.nation();
		s.province();

	}
public void language()
{
	System.out.println("Kannada");
	System.out.println("English");
}


}
