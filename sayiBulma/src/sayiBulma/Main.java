package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {10,9,8,6,4,3,2};
		int aranacak = 4;
		boolean varMi = false;
		
		for(int i=0;i<7;i++) {
			if(aranacak == numbers[i]) {
				varMi=true;
				System.out.println("Sayi mevcut!");
			}
			
		}
		
		if(varMi==false) {
			System.out.println("Sayi mevcut degil!");
		}
	}

}
