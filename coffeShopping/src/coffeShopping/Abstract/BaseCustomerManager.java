package coffeShopping.Abstract;

import coffeShopping.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to database :"+customer.getFirstName());
	}
}