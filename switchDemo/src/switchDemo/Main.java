package switchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade = 'D';
		
		switch(grade) {
		case 'A':
			System.out.println("Mukemmel!");
			break;
		case 'B':
			System.out.println("Cok iyi!");
			break;
		case 'C':
			System.out.println("İyi!");
			break;
		case 'D':
			System.out.println("Normal!");
			break;
		case 'F':
			System.out.println("Kaldiniz!");
			break;
			default:
				System.out.println("Gecersiz ifade!");
		}
			

	}

}
