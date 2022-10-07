package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 33550336;
		int rem = 0;
		int flg = 0;
		int total = 0;
		
		for(int i=1;i<sayi;i++) {
			rem = sayi % i;
			if(rem == 0) {
				total += i;
			}
		}
		if(total == sayi) {
			System.out.println(sayi + " mukemmel sayidir!");
		}
		else {
			System.out.println(sayi + " mukemmel sayi degildir");
		}
	}

}
