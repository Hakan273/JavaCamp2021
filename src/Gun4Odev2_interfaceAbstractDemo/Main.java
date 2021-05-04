import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerMernisAdapter = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerCheckManager = new NeroCustomerManager(new CustomerCheckManager());

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Engin");
		customer1.setLastName("Demiroð");
		customer1.setDateOfBirth(LocalDate.of(1985, 1, 6));
		customer1.setNationalityId("28861499108");

		System.out.println("Starbucks Costumer: ");
		customerMernisAdapter.save(customer1);
		
		System.out.println("---------------------------------");
		
		System.out.println("Nero Costumer: ");
		customerCheckManager.save(customer1);

	}

}
