var myApp = angular.module('myApp',  ['ui.bootstrap']);
myApp.controller('enventCtrl', function($scope, $http,$rootScope) {

  $scope.getEventNew = function() {



    $http.get("http://localhost:8080/DoAnCuoiKy/sanpham/list")
    .then(function(response) {
      $scope.myInterval = 1000;
      $rootScope.sanpham = response.data;

    });
  };
  $scope.getloaisp = function() {



    $http.get("http://localhost:8080/DoAnCuoiKy/loaisanpham/list")
    .then(function(response) {
      $scope.loaisanpham = response.data;
  console.log( $scope.loaisanpham) ;
    });
  };
  $scope.getnhasanxuat = function() {



    $http.get("http://localhost:8080/DoAnCuoiKy/nhasanxuat/list")
    .then(function(response) {
      $scope.nhasanxuat = response.data;
  console.log( $scope.nhasanxuat) ;
    });
  };
  $scope.createProduct = function()
  {
    var data = {
      ten_sp: $scope.tensp,
      gia: $scope.gia,
      soluong: $scope.soluong,
      ma_loai: {
        ma_loai_sp:$scope.loaisp.ma_loai_sp
      },
      ngay_nhap: $scope.ngaynhap,
      nha_sx: {ma_nha_sx:$scope.nhasx.ma_nha_sx},
      hinh_anh: "1.png"
    };


    console.log(parse) ;
    $http.post('http://localhost:8080/DoAnCuoiKy/sanpham/create',  data)

					.then(function mySucces(response) {


								});
  };


});
