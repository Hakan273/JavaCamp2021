package Concrete;
import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckManager customerCheckManager;

	public NeroCustomerManager(CustomerCheckManager customerCheckManager) {
		super();
		this.customerCheckManager = customerCheckManager;
	}

	public void save(Customer customer) {

		if (customerCheckManager.CheckIfRealPerson(customer)) {
			System.out.println("valid person");
			super.save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}
	
}
