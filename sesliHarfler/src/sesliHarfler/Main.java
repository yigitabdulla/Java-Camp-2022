package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'J';
		
		switch(harf) {
		
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın sesli harf!");
				break;
			case 'E':
			case 'İ':
			case 'Ö':
			case 'Ü':
				System.out.println("Ince sesli harf!");
				break;
			default:
				System.out.println("Geçersiz harf!");
			
		}
	}

}
