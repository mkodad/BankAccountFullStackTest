package org.sgcib.itec.fcc.exception;


/**
 * Created by mkodad on 07/05/18.
 */


public class InputFailedException extends RuntimeException {

  
	private static final long serialVersionUID = -4940276475887282505L;
	
	private String message;

    public InputFailedException(String message) {
        this.message = message;
    }

	public String getMessage() {
		return message;
	}
    
    
}
