'use strict'

var demoApp = angular.module('app', [ 'ui.bootstrap', 'app.controllers',
		'app.services' ]);
demoApp.constant("CONSTANTS", {
	getBalanceUrl : "http://localhost:8080/api/v1/customers/"
});