package coreJava;

public class staticVar {
	String name;
	String address;
	static String city;
	static int i;
	static {
		city = "kabayoran";
		i = 0;
	}
	
	staticVar(String name, String address) {
		this.name= name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(address +" "+ city);
	}
	
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticVar obj	= new staticVar("Izi", "Jakarta");
		staticVar obj1	= new staticVar("Izi", "Serang");
		obj.getAddress();
		obj1.getAddress();
		staticVar.getCity();
		staticVar.i=4;
		obj.address="XYZ";

		
	}

}
