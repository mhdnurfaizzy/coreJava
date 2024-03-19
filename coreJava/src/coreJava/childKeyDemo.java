package coreJava;

public class childKeyDemo extends parentKeyDemo{
	
	String nameString = "ChildName";
	
	public childKeyDemo() {
		super();
		System.out.println("child class constructor");
		
	}
	
	public void getStringData() {
		System.out.println(nameString);
		//it call from parent string
		System.out.println(super.nameString);
	}
	
	public void getData() {
		//it call from parent class
		super.getData();
		//it call from child class
		System.out.println("Im in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childKeyDemo cDemo = new childKeyDemo();
		
		cDemo.getStringData();
		cDemo.getData();
		

	}

}
