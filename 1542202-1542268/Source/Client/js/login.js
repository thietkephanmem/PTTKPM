var myApp = angular.module('myApp',  ['ui.bootstrap']);
myApp.controller('logincontroller', function($scope, $http,$rootScope) {

	$scope.getloaisp = function() {



		$http.get("http://localhost:8080/DoAnCuoiKy/loaisanpham/list")
		.then(function(response) {
			$scope.loaisanpham = response.data;
			console.log( $scope.loaisanpham) ;
		});
	};
	$scope.checklogin = function()
	{	
		var data = {
			user : $scope.user,
			password: $scope.pass
		}
		$http.post("http://localhost:8080/DoAnCuoiKy/nguoidung/login",data)
		.then(function(response) {
			localStorage.setItem("username", response.data.user);
			alert("login thanh cong");

		});

		console.log(localStorage.getItem("username"));
	};
	$scope.getmenu = function(){
		var data = {
			ma_danh_muc : "1"
		}
		$http.post("http://localhost:8080/DoAnCuoiKy/loaisanpham/menu",data)
		.then(function(response) {
			$scope.getmenunam = response.data;
			console.log( $scope.getmenunam) ;
		});
	};
	$scope.getmenunu = function(){
		var data = {
			ma_danh_muc : "2"
		}
		$http.post("http://localhost:8080/DoAnCuoiKy/loaisanpham/menu",data)
		.then(function(response) {
			$scope.getmenunu= response.data;
			console.log( $scope.getmenunu) ;
		});
	};
	



});
