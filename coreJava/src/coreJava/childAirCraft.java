package coreJava;

public class childAirCraft extends parentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childAirCraft a = new childAirCraft();
		a.engine();
		a.safetyGuidelinse();
		a.bodyColour();
	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Red body colour");
	}
	

}
