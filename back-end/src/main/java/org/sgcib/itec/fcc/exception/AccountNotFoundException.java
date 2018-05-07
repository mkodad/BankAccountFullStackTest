package org.sgcib.itec.fcc.exception;

/**
 * Created by mkodad on 07/05/18.
 */


public class AccountNotFoundException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3358138810490402657L;
	
	private String message;

    public AccountNotFoundException(String message) {
        this.message = message;
    }

	public String getMessage() {
		return message;
	}
     
}
