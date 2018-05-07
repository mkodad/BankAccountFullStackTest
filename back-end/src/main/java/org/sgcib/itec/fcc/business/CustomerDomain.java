package org.sgcib.itec.fcc.business;

import java.util.List;
import java.util.Optional;

import org.sgcib.itec.fcc.repository.ICustomerRepository;


public class CustomerDomain {

    private final ICustomerRepository customerRepository;

    public CustomerDomain(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    
	public Optional<Account> getAccount(String login, String accountId)
	{

	    Optional<Customer> customer = customerRepository.getCustomer(login);
		
		if(customer.isPresent())
		{
			List<Account> listAccount = customer.get().getAccounts();
			
			if (listAccount != null && !listAccount.isEmpty()) {
				
				return Optional.ofNullable(listAccount.stream().filter(p -> p.getId().equals(accountId)).findFirst().orElse(null));
			}
			
		}
		
		return null;
		
	}
 
}