package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu="�nternet �ubesi";
		double dolarDun = 8.10;
		double dolarBugun=8.20;	
	    int vade=36;
	    boolean dustuMu=false;
	    
		System.out.println("internetSubeButonu");
		if(dolarBugun<dolarDun) {
			System.out.println("dolarDustuResmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("dolarYulseldiResmi");
			}
		else {
			System.out.println("dolarEsittirResmi");
		}
		String[] krediler= {"H�zl� Kredi",
				            "Mutlu Emekli Kredisi",
				            "Konut Kredisi",
				            "�ift�i Kredisi",
				            "Msb Kredisi",
				            "Meb Krdisi"
				            } ;
		//foreach
		for(String kredi:krediler){
			System.out.println(kredi);
			
			
		}
	for(int i=0; i<krediler.length;i++) {
		System.out.println(krediler[i]);
		
		
	}
	int sayi1=10;
	int sayi2=20;
	sayi1=sayi2;
	sayi2=100;
	System.out.println(sayi1);
	
	String sehir1="Ankara";
	String sehir2="�stanbul";
	sehir1=sehir2;
	sehir2="�zmir";
	System.out.println(sehir1);
	
	
		}
			
		
			
			
		
		

	

}
