package Interface;

public class AustralianTraffic implements CentralTraffic, ContinetalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a= new AustralianTraffic();
		a.GreenGo();
		a.RedStop();
		a.YellowSlow();
		AustralianTraffic as=new AustralianTraffic();
		as.HandSymbol();
		ContinetalTraffic ct=new AustralianTraffic();
		ct.TrainSignal();

	}

	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("If signal light is Green then Go");
		
	}

	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("If signal light is Red then Stop");
	}

	public void YellowSlow() {
		// TODO Auto-generated method stub
		System.out.println("If signal light is Yelloe then make your vehical Slow");
		
	}
	public void HandSymbol() {
		System.out.println("If signal is Hand symbol and all traffic lights should be red");
	}

	public void TrainSignal() {
		// TODO Auto-generated method stub
		System.out.println("These signals are for Train");
	}
}
