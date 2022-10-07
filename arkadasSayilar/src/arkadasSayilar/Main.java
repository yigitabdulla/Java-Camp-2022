package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int num1 = 220;
		int num2 = 284;
		int total = 0;
		int total2 = 0;
		
		for(int i=1;i<num1;i++) {
			if(num1 % i == 0) {
				total += i;
			}
			
		}
		
		for(int i=1;i<num2;i++) {
			if(num2 % i == 0) {
				total2 += i;
			}
			
		}
		
		if(num1==total2 && num2==total) {
			System.out.println(num1 + " ve " + num2 + " arkadas sayidir!");
		}
		else {
			System.out.println("Sayilar arkadas sayi degildir!");
		}

	}

}
