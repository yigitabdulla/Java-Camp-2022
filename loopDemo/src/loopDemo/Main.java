package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("End of for loop!");
		
		int j = 0;
		while(j<10) {
			System.out.println(j);
			j++;
		}
		System.out.println("End of while loop!");
		
		int k=0;
		
		do{
			System.out.println(k);
			k+=2;
		}while(k<10);
		System.out.println("End of do-while loop!");
		
	}

}
