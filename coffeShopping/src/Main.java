import java.util.GregorianCalendar;

import adapters.MernisServiceAdapter;
import coffeShopping.Abstract.BaseCustomerManager;
import coffeShopping.Abstract.CustomerCheckService;
import coffeShopping.Concrete.NeroCustomerManager;
import coffeShopping.Concrete.StarbucksCustomerManager;
import coffeShopping.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setIdentityNumber("00000000000");
		customer1.setFirstName("Kemal");
		customer1.setLastName("Gürgen");
		customer1.setBirthDate(new GregorianCalendar(1995, 01 , 01).getTime());
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer1);
		
		
		
	}

}
