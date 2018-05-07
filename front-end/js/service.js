'use strict'

angular.module('app.services', []).factory('service',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getUserById = function(loginId,accountId) {
				var url = CONSTANTS.getBalanceUrl + loginId + "/accounts/" + accountId + "/balance";
				return $http.get(url);
			}
			
			return service;
		} ]);