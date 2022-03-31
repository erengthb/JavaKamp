package interfaces;



public class CustomerManager {

	
	// Dependency Injection
	
	private ILogger[] loggers ;
	
	
	public CustomerManager(ILogger[] loggers) {  //Referans Atamasý var
		
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi : " + customer.getFirstName());
        
		// Utils static yapýldýðý için direkt sýnýftan Utils. diye çaðýrma 
		// iþlemi yapabiliyoruz aksi halde new leyerek kullanýlmasý gerekiyor.
        Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	
	
	public void delete(Customer customer) {
		
		System.out.println("Müþteri Silindi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
	}
	
}

