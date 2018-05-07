package org.sgcib.itec.fcc.repository;

import java.util.Optional;

import org.sgcib.itec.fcc.business.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * updated by mkodad on 07/05/18.
 */


public  interface ICustomerRepository extends JpaRepository<Customer, String> 
{
		
	public default Optional<Customer> getCustomer(String login) 
	{		
		return Optional.ofNullable(findAll().stream().filter(p -> p.getLogin().equals(login)).findFirst().orElse(null));
	}


}
