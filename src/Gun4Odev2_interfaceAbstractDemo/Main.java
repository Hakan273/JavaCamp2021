package Gun4Odev2_interfaceAbstractDemo;

import java.time.LocalDate;
import Gun4Odev2_interfaceAbstractDemo.Abstract.BaseCustomerManager;
import Gun4Odev2_interfaceAbstractDemo.Adapters.MernisServiceAdapter;
import Gun4Odev2_interfaceAbstractDemo.Concrete.CustomerCheckManager;
import Gun4Odev2_interfaceAbstractDemo.Concrete.NeroCustomerManager;
import Gun4Odev2_interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import Gun4Odev2_interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerMernisAdapter = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerCheckManager = new NeroCustomerManager(new CustomerCheckManager());

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Engin");
		customer1.setLastName("Demiro�");
		customer1.setDateOfBirth(LocalDate.of(1985, 1, 6));
		customer1.setNationalityId("28861499108");

		System.out.println("Starbucks Costumer: ");
		customerMernisAdapter.save(customer1);
		
		System.out.println("---------------------------------");
		
		System.out.println("Nero Costumer: ");
		customerCheckManager.save(customer1);

	}

}
