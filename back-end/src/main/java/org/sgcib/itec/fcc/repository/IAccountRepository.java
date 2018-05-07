package org.sgcib.itec.fcc.repository;

import java.util.Optional;

import org.sgcib.itec.fcc.business.Account;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * updated by mkodad on 07/05/18.
 */


public interface IAccountRepository extends JpaRepository<Account, String>  
{
	
	public default Optional<Account> getAccount(String id) {
		  return findById(id);
	}
	

	public default boolean isBalanceAccountExist(double balance, String id) {
		
		Optional<Account> account = findById(id);
		
		if(account.isPresent() && account.get().getBalance() == balance)
		{
			return true;
		}
		
        return false;
	}
	

	public  Optional<Account> findById(String id);
	
	
}
