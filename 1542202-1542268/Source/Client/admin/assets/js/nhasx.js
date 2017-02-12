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
  $scope.crearensx= function() {
    var data =
    {  
      ma_nha_sx:  $scope.mansx, 
      ten_nha_sx: $scope.tennsx,
      email: $scope.email,
      dia_chi: $scope.diachi,
      SDT: $scope.sdt
   
    }
    console.log(data);

    $http.post("http://localhost:8080/DoAnCuoiKy/nhasanxuat/create", data)
    .then(function(response) {
      $window.location.reload();
     alert("Save & update thành công");


      

    });
  };
  $scope.editnsx= function(mansx, tennsx,email,diachi,sdt) {
    $scope.mansx = mansx
      $scope.tennsx = tennsx;
       $scope.email = email;
      $scope.diachi= diachi;
      $scope.sdt = sdt;
    var data =
    { ma_nha_sx: mansx,
      ten_nha_sx: $scope.tennsx,
      email: $scope.email,
      dia_chi: $scope.diachi,
      SDT: $scope.sdt
   
    }
    console.log(data);

    // $http.post("http://localhost:8080/DoAnCuoiKy/nhasanxuat/create", data)
    // .then(function(response) {
    //   $window.location.reload();
    //  alert("Save & update thành công");


      

    // });
  };
});

