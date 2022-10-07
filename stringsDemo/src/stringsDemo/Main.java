package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Merhaba hocam";
		System.out.println(mesaj);
		
		/*
		 * System.out.println("Karakter sayisi: " + mesaj.length());
		 * System.out.println("4. eleman: " + mesaj.charAt(3));
		 * System.out.println(mesaj.concat(" nasilsiniz"));
		 * System.out.println(mesaj.startsWith("g"));
		 * System.out.println(mesaj.endsWith("m"));
		 * 
		 * char[] karakterler = new char[5]; mesaj.getChars(0, 4, karakterler, 0);
		 * System.out.println(karakterler); System.out.println(mesaj.indexOf('r'));
		 * System.out.println(mesaj.lastIndexOf("h"));
		 */
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(3, 7));
		
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
	}

}
