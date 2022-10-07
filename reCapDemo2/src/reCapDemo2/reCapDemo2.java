package reCapDemo2;

public class reCapDemo2 {

	public static void main(String[] args) {
		
		double[] dList = {1.3,7.8,4.4,2.7};
		double total = 0;
		double max = dList[0];
		
		for(double number:dList) {
			if(max<number) {
				max = number;
			}
			
			System.out.println(number);
			total += number;
			
		}
		
		System.out.println(total);
		System.out.println("Bigges number is " + max);
	}

}
