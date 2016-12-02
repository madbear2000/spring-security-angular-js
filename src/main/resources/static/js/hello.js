angular.module('hello', [])
  .controller('home', function($http) {
	  
	  var ctrl = this;
	  
	  $http.get('/greeting')
	  	.then(function(response) {
		  ctrl.greeting = response.data;
	  })
});