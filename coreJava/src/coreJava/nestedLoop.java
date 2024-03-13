package coreJava;

public class nestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nested loops works
		for (int i=1;i<=4;i++) //(outer for loop) this block will loop for 4 times
		{
			System.out.println("Outer loop started");
			for (int j=1;j<=4;j++) //inner for loop
			{
				System.out.println("inner loop");
			}
			System.out.println("Outer loop finished");
		}
		
		//Pyramid for loop
		int k=1;
		for (int i=0;i<4;i++) //(outer for loop) this block will loop for 4 times
		{
//			System.out.println("Outer loop started");
			for (int j=1;j<=4-i;j++) //inner for loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		

	}
	
	

}
