package coreJava;

public class thisDemo {
	
	int a = 2;
	public void getData() {
		int a = 3;
		
		//it call from method
		System.out.println(a);
		//it call from class
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo tDemo = new thisDemo();
		tDemo.getData();

	}

}
