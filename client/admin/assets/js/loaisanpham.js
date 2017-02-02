var myApp = angular.module('myApp',  []);
myApp.controller('loaisanphamctrl', function($scope, $http,$window) {
	$scope.getloaisp = function() {



    $http.get("http://localhost:8080/DoAnCuoiKy/loaisanpham/list")
    .then(function(response) {

      $scope.loaisanpham = response.data;
      for (var i = 0; i < $scope.loaisanpham.length; i++)
      {
        if ($scope.loaisanpham[i].ma_danh_muc == "1") 
        {
          $scope.loaisanpham[i].ma_danh_muc = "nam";
        }
        else $scope.loaisanpham[i].ma_danh_muc = "nu";
      }

      console.log( $scope.loaisanpham );
    });
  };
  $scope.deletelsp = function(malsp) {
    var data =
    {  
    ma_loai_sp: malsp
   
    }


    $http.post("http://localhost:8080/DoAnCuoiKy/loaisanpham/delete", data)
    .then(function(response) {
      $window.location.reload();
     alert("Xóa thành công");


      

    });
  };
});

