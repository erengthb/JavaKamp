package intro;

public class Main {


	public static void main(String[] args) {
		
		//String internetSubeButonu ="�nternet �ubesi";
	
		double dolarDun= 8.15;
		double dolarBugun= 8.18;
		
		int vade = 36;
		
		boolean dustuMu= true;
		
		//System.out.println(internetSubeButonu);
		
		if(dolarDun>dolarBugun) {
			
			System.out.println("A��a�� Do�ru Ok");
			
		} else
			System.out.println("Yukar� do�ru Ok");
		
		
		
		String[] krediler = {"H�zl� Kredi","Mutlu Emekli Kredisi",
				"Konut Kredisi","�iftci Kredisi","Msb Kredisi",
				"Meb Kredisi","K�lt�r Bakanl��� Kredisi"};
		
		//foreach d�ng�s�
		for (String kredi : krediler) {
			
			System.out.println(kredi);
			
		}
		
		// Normal For D�ng�s�
		for(int i = 0; i<krediler.length; i++) {
			
			System.out.println(krediler[i]);
			
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int []sayilar1 = {1,2,3,4,5};
		int []sayilar2 = {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		
		String �ehir1= "Ankara";
		String �ehir2= "�stanbul";
		�ehir1=�ehir2;
		�ehir2="�zmir";
		System.out.println(�ehir1);
		
		
		
		
		

	}
	
}

