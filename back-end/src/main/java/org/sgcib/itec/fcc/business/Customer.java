package org.sgcib.itec.fcc.business;

import static javax.persistence.FetchType.LAZY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	private String login;
	
	
    @OneToMany(fetch = LAZY)
	List<Account> accounts  = new ArrayList<>();

    public Customer(String login) {
        this.login = login;
    }

    public Customer(String login, Account... accounts) {
        this(login);
        this.accounts.addAll(Arrays.asList(accounts));
    }

    public String getLogin() {
        return login;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Customer() {
    }
    
}
