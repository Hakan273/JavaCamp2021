package Gun4Odev2_interfaceAbstractDemo.Abstract;
import Gun4Odev2_interfaceAbstractDemo.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
	}

}
