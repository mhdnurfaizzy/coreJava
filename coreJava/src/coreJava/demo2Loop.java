package coreJava;

public class demo2Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int k=1;
		for (int i=1;i<=5;i++) //(outer for loop) this block will loop for 4 times
		{
//			System.out.println("Outer loop started");
			for (int j=1;j<=i;j++) //inner for loop
			{
				System.out.print(j);
				System.out.print("\t");
//				k++;
			}
			System.out.println("");
		}
	}

}
