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
  $scope.getlistallsp = function() {



    $http.get("http://localhost:8080/DoAnCuoiKy/sanpham/listall")
    .then(function(response) {

      $scope.listsp = response.data;
      console.log($scope.listsp);



      $scope.totalItems = $scope.listsp.length;
      $scope.itemsPerPage = 8
      $scope.currentPage = 1;

    // $scope.setPage = function (pageNo) {
    //   $scope.currentPage = pageNo;
    // };

    // $scope.pageChanged = function() {
    //   console.log('Page changed to: ' + $scope.currentPage);
    // };

    $scope.maxSize = 5;
    $scope.bigTotalItems = 175;
    $scope.bigCurrentPage = 1;
    
    $scope.pageCount = function () {
     return Math.ceil($scope.listsp.length / $scope.itemsPerPage);
   };

   $scope.$watch('currentPage + itemsPerPage', function() {
     var begin = (($scope.currentPage - 1) * $scope.itemsPerPage),
     end = begin + $scope.itemsPerPage;

     $scope.filteredlistsp = $scope.listsp.slice(begin, end);
   });

 });
  };

});
