package org.sgcib.itec.fcc.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {


	@Id
	@Column(name="ID")
	private String id;
	
	@Column(name="BALANCE")
	private  double balance;
    

    public Account(String id) {
        this.id = id;
    }

    public Account(String id, double balance) {
        this(id);
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public Account() {
    }
}
