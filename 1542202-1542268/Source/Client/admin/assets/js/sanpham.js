var myApp = angular.module('myApp',  []);
myApp.controller('sanphamctrl', function($scope, $http,$window) {
	$scope.getEventNew = function() {



    $http.get("http://localhost:8080/DoAnCuoiKy/sanpham/listall")
    .then(function(response) {
     
      $scope.sanpham = response.data;
      console.log($scope.sanpham);

    });
  };
  $scope.deletesp = function(masp,maloai,mahasx) {
  	var data =
  	{  
		ma_sp: masp,
		ma_loai:{ma_loai_sp: maloai},
		nha_sx:{ma_nha_sx:mahasx}
  	}


    $http.post("http://localhost:8080/DoAnCuoiKy/sanpham/delete", data)
    .then(function(response) {
    	$window.location.reload();
     alert("Xóa thành công");


      

    });
  };
});
	
