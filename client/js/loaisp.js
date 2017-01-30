var myApp = angular.module('myApp',  ['ui.bootstrap']);
myApp.controller('loaispCtrl', function($scope, $http,$rootScope) {

  $scope.getloaisp = function() {



    $http.get("http://localhost:8080/DoAnCuoiKy/loaisanpham/list")
    .then(function(response) {
      $scope.loaisanpham = response.data;
console.log( $scope.loaisanpham) ;
    });
  };

  




});
