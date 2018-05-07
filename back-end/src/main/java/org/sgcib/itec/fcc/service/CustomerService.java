package org.sgcib.itec.fcc.service;

import org.sgcib.itec.fcc.business.Account;
import org.sgcib.itec.fcc.repository.IAccountRepository;

/**
 * Created by mkodad on 07/05/18.
 */

public class CustomerService {
	
		
	private  IAccountRepository acountRepository;
	
	
	public CustomerService(IAccountRepository acountRepository) {
		this.acountRepository = acountRepository;
	}

		
	public void saveAcountBalance(Account account)
	{
		acountRepository.save(account); 
	}
	
	
	public boolean checkAccountExist(String accountId)  
	{
		return acountRepository.getAccount(accountId).isPresent();
	}
	

	public boolean checkBalanceAccountExist(double balance, String accountId) {
		return acountRepository.isBalanceAccountExist(balance, accountId);
	}
	
	
}
