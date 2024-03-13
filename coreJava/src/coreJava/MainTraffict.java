package coreJava;

public class MainTraffict implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new MainTraffict();
		a.greenGo();
		a.redStop();
		a.FlashYellow();
		
		MainTraffict at = new MainTraffict();
		at.walkonsymbol();
		ContinentalTraffic ts = new MainTraffict();
		ts.Trainsymbol();
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green go Implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop Implementation");

	}
	
	public void walkonsymbol() {
		System.out.println("walking");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow flash Implementation");

	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbol Implementation");
		
	}

}
