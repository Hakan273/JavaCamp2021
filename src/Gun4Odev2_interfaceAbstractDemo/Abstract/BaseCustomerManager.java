package Gun4Odev2_InterfaceAbstractDemo.Abstract;

import Gun4Odev2_InterfaceAbstractDemo.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
	}

}

