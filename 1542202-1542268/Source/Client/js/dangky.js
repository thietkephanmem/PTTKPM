var myApp = angular.module('myApp',  []);
myApp.controller('dangky', function($scope, $http) {
	$scope.dangkynd= function() {
    
    var data =
    {  
      user:  $scope.user, 
      password: $scope.pass,
      ten_nguoidung: $scope.tennd,
      sdt: $scope.sdt, 
      ngay_sinh: new Date($scope.ngaysinh)
      
    }
    console.log(data);

    $http.post("http://localhost:8080/DoAnCuoiKy/nguoidung/create", data)
    .then(function(response) {
      // $window.location.reload();
      alert("Dang ky thanh cong");


      

    });
  };
});