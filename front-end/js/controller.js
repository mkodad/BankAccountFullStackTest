'use strict'

var module = angular.module('app.controllers', []);
module.controller("controller", [ "$scope", "service",
		function($scope, service) {

			$scope.login = null;
			$scope.account = null;
			$scope.balanceResponse = null;


			$scope.editBalance = function() {

				service.getUserById($scope.login,$scope.account).then(function(value) {
					console.log(value.data);
					$scope.balanceResponse = value.data;
				}, function(reason) {
					console.log("error occured");
					$scope.balanceResponse = '0';
				}, function(value) {
					console.log("no callback");
					$scope.balanceResponse = '0';
				});
			}
		} ]);