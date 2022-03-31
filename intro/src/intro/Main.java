package intro;

public class Main {


	public static void main(String[] args) {
		
		//String internetSubeButonu ="Ýnternet Þubesi";
	
		double dolarDun= 8.15;
		double dolarBugun= 8.18;
		
		int vade = 36;
		
		boolean dustuMu= true;
		
		//System.out.println(internetSubeButonu);
		
		if(dolarDun>dolarBugun) {
			
			System.out.println("Aþþaðý Doðru Ok");
			
		} else
			System.out.println("Yukarý doðru Ok");
		
		
		
		String[] krediler = {"Hýzlý Kredi","Mutlu Emekli Kredisi",
				"Konut Kredisi","Çiftci Kredisi","Msb Kredisi",
				"Meb Kredisi","Kültür Bakanlýðý Kredisi"};
		
		//foreach döngüsü
		for (String kredi : krediler) {
			
			System.out.println(kredi);
			
		}
		
		// Normal For Döngüsü
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
		
		
		String þehir1= "Ankara";
		String þehir2= "Ýstanbul";
		þehir1=þehir2;
		þehir2="Ýzmir";
		System.out.println(þehir1);
		
		
		
		
		

	}
	
}

