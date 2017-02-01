var myApp = angular.module('myApp',  ['ui.bootstrap']);
myApp.controller('chitietsanpham', function($scope, $http,$location) {

	$scope.getchitietsp = function() {
		var data ={
			
				ma_sp: $location.search()['masp']
			
		}

		console.log($location.search()['masp']);

		$http.post("http://localhost:8080/DoAnCuoiKy/sanpham/findbyid", data)
		.then(function(response) {
			$scope.chitietsp = response.data;
			console.log( $scope.chitietsp) ;
		});
	};






});
myApp.config(function($locationProvider) {
	$locationProvider.html5Mode({
		enabled: true,
		requireBase: false
	});    });
