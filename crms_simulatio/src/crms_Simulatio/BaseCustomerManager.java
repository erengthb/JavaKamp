
package crms_Simulatio;


public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public  void Save(Customer customer) {
		System.out.println("Save to database " + customer.FirstName );
		
	}

}
