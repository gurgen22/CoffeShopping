package coffeShopping.Concrete;

import coffeShopping.Abstract.CustomerCheckService;
import coffeShopping.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    } 
}