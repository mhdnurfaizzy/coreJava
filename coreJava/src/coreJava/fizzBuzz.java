package coreJava;


public class fizzBuzz {
	
	int n = 15;
	
	public void fizzBuzzTest(int n) {
		for(int i=1; i<=n; i++) {
			if ( i%3 == 0 && i%5 == 0) {
				System.out.println("Fizz Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				 System.out.println("Buzz");
			}
		}
	}
	
	


}

