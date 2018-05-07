package org.sgcib.itec.fcc.controller;

import java.util.Optional;

import org.sgcib.itec.fcc.business.CustomerDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.sgcib.itec.fcc.constant.*;


/**
 * Created by mkodad on 07/05/18.
 */

@RequestMapping(Constants.API_VERSION)
@RestController
public class CustomerController {

	@Autowired
	private CustomerDomain customerDomain;

	@RequestMapping(method = RequestMethod.GET, path = Constants.GET_BALANCE_BY_CUSTOMERSLOGIN__ACCOUNTID)
	public String getBalanceWithLoginAndAccount(@PathVariable String login, @PathVariable String accountId) {
		return String.valueOf(Optional.ofNullable(customerDomain.getAccount(login, accountId))
				.map(o -> o.get().getBalance()).orElse(0.0));

	}

}
