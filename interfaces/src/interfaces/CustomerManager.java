package interfaces;



public class CustomerManager {

	
	// Dependency Injection
	
	private ILogger[] loggers ;
	
	
	public CustomerManager(ILogger[] loggers) {  //Referans Atamas� var
		
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri Eklendi : " + customer.getFirstName());
        
		// Utils static yap�ld��� i�in direkt s�n�ftan Utils. diye �a��rma 
		// i�lemi yapabiliyoruz aksi halde new leyerek kullan�lmas� gerekiyor.
        Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	
	
	public void delete(Customer customer) {
		
		System.out.println("M��teri Silindi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
	}
	
}

