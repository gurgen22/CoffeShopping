package coffeShopping.Concrete;

import coffeShopping.Abstract.BaseCustomerManager;
import coffeShopping.Abstract.CustomerCheckService;
import coffeShopping.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if( customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Not a valid Person");
		}
		
	}
}
