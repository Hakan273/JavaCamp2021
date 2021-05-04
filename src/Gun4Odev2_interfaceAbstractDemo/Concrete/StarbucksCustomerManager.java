package Concrete;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private MernisServiceAdapter mernisServiceAdapter;

	public StarbucksCustomerManager(MernisServiceAdapter mernisServiceAdapter) {
		super();
		this.mernisServiceAdapter = mernisServiceAdapter;
	}

	public void save(Customer customer) {

		if (mernisServiceAdapter.CheckIfRealPerson(customer)) {
			System.out.println("valid person");
			super.save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}

}
