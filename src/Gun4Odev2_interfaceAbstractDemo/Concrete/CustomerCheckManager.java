package Gun4Odev2_InterfaceAbstractDemo.Concrete;

import Gun4Odev2_InterfaceAbstractDemo.Abstract.CustomerCheckService;
import Gun4Odev2_InterfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}
	

}
