package sayiAsalMi;

public class Main {

	public static void main(String[] args) {
		int number = 11;
		int counter = 0;
		int rem = 0;
		
		if(number<2) {
			System.out.println("Number is not prime!");
			return;
		}
		
		
		for(int i=2;i<number;i++) {
			rem = number%i;
			if(rem == 0) {
				counter++;
			}
		}
		
		if(counter != 0) {
			System.out.println("Number is not prime!");
		}
		else {
			System.out.println("Number is prime!");
		}
	}

}
