package day01_02_Variables;

public class C03_Variables {

	public static void main(String[] args) {
		
		int sayi1 = 10; 
		int sayi2 = 20;
		
		String sayi3 = "10";
		String sayi4 = "20";
		
		System.out.println(sayi1+sayi2);
		System.out.println(sayi3+sayi4);
		
		String harf1= "A";
		char harf2 = 'A';
		
		//Yukar?daki de?i?kenleri kullanarak 30A yazd?r?n
		
		System.out.println(sayi1+sayi2+harf1);
		System.out.println(sayi1+sayi2+harf2); //Ascii tablosuna g?re i?lem yapar.(95)
		
		System.out.println(harf1+sayi1+sayi2);
		System.out.println(sayi1+harf1+sayi2);
		System.out.println(harf1+(sayi1+sayi2));
		
		
	}

}
