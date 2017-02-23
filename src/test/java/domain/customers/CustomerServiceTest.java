package domain.customers;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CustomerServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerRepository customerRepository;
    private CustomerService customerService;

    @Test
    public void addCustomerShouldAddCustomerToCustomerRepo(){
        customerService.addCustomer("1", "Jebus","Dontbelievein");

        Mockito.verify(customerRepository).addCustomer(new Customer("1","Jebus","Dontbelievein"));
    }
}



