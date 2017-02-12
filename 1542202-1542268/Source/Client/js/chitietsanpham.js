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
myApp.config(function($locationProvider) {
	$locationProvider.html5Mode({
		enabled: true,
		requireBase: false,
		rewriteLinks : false
	});    });
