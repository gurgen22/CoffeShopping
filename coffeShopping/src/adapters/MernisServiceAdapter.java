package adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import coffeShopping.Abstract.CustomerCheckService;
import coffeShopping.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = kpsPublicSoapProxy.TCKimlikNoDogrula
					  (Long.parseLong(customer.getIdentityNumber()), 
					  customer.getFirstName().toUpperCase(), 
					  customer.getLastName().toUpperCase(), 
					  customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					  );
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
		
		
	}

}
