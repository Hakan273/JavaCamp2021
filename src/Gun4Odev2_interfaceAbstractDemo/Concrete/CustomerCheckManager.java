package Gun4Odev2_interfaceAbstractDemo.Concrete;
import Gun4Odev2_interfaceAbstractDemo.Abstract.CustomerCheckService;
import Gun4Odev2_interfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("always valid person");
		return true;
	}
	

}
