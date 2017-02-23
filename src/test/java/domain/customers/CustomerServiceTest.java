package domain.customers;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class CustomerServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void addCustomerShouldAddCustomerToCustomerRepo()throws Exception{
        customerService.addCustomer(1, "Jebus","Dontbelievein");
        verify(customerRepository).addCustomer(new Customer(1,"Jebus","Dontbelievein"));
    }
}



