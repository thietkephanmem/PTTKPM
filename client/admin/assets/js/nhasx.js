var myApp = angular.module('myApp',  []);
myApp.controller('nhasxctrl', function($scope, $http,$window) {
	$scope.getnsx = function() {



    $http.get("http://localhost:8080/DoAnCuoiKy/nhasanxuat/list")
    .then(function(response) {
      $scope.nhasanxuat = response.data;
  });
};
 $scope.deletensx= function(mansx) {
    var data =
    {  
    ma_nha_sx: mansx
   
    }
console.log(data);

    $http.post("http://localhost:8080/DoAnCuoiKy/nhasanxuat/delete", data)
    .then(function(response) {
      $window.location.reload();
     alert("Xóa thành công");


      

    });
  };
});

