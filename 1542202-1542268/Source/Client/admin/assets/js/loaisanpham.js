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

  $scope.createlsp= function() {
    
    var data =
    {  
      ma_loai_sp:  $scope.manlsp, 
      ten_loai_sp: $scope.tenlsp,
      ma_danh_muc: $scope.dm
      
    }
    console.log(data);

    $http.post("http://localhost:8080/DoAnCuoiKy/loaisanpham/create", data)
    .then(function(response) {
      $window.location.reload();
      alert("Save & update thành công");


      

    });
  };
  $scope.editlsp= function(manlsp, tenlsp,dm) {

    $scope.manlsp = manlsp
    $scope.tenlsp = tenlsp;
    $scope.dm = dm;

    if ($scope.dm =='nam') {
      $scope.dm = '1';
    }
    else $scope.dm ='2';
    
    var data =
    { ma_loai_sp: $scope.manlsp,
      ten_loai_sp:  $scope.tenlsp,
      ma_danh_muc: $scope.dm
      
      
    }
    console.log(data);

    
  };
});

