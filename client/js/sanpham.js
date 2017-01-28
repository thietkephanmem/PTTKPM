var myApp = angular.module('myApp',  ['ui.bootstrap']);
myApp.controller('enventCtrl', function($scope, $http,$rootScope) {

  $scope.getEventNew = function() {



    $http.get("http://localhost:8080/DoAnCuoiKy/sanpham/list")
    .then(function(response) {
      $scope.myInterval = 1000;
      $rootScope.sanpham = response.data;
      //console.log($scope.sanpham);

    });
  };

// console.log(  $rootScope.sanpham );
 // Initializing  slide rray

});
