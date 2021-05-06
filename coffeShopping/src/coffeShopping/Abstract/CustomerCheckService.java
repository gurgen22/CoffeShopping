package coffeShopping.Abstract;

import coffeShopping.Entities.Customer;

public interface CustomerCheckService {
	
		boolean checkIfRealPerson(Customer customer);
}
