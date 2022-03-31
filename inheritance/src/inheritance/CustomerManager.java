package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) { // base s�n�f� yazmak yeterli
		
		
		System.out.println(customer.customerNumber + " kaydedildi.");
				
	}
	
	// bulk insert
	public void addMultiple(Customer[] customers) {
 
		
		
		for (Customer customer : customers ) {
			add(customer);
			
		}
		
		
	}

}
