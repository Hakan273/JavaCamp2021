package Gun4Odev2_interfaceAbstractDemo.Adapters;

import Gun4Odev2_interfaceAbstractDemo.Abstract.CustomerCheckService;
import Gun4Odev2_interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		System.out.println("Mernis Check");
		
		try {
			KPSPublicSoap mernisValidation = new KPSPublicSoapProxy();
			return mernisValidation.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;

	}

}
