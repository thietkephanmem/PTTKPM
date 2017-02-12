var myApp = angular.module('myApp',  ['ui.bootstrap']);
myApp.controller('enventCtrl', function($scope, $http,$rootScope,$location) {

$scope.getchitietsp = function() {
    var data ={
      
        ma_sp: $location.search()['masp']
      
    }

    console.log($location.search()['masp']);

    $http.post("http://localhost:8080/DoAnCuoiKy/sanpham/findbyid", data)
    .then(function(response) {
      $scope.chitietsp = response.data;
      console.log( $scope.chitietsp) ;
    });
  };
$scope.gettenloaisp = function(){
  // $window.location.reload();
  var data = {
    ma_loai:{
      ma_loai_sp: $location.search()['loaisp']
    } 
  };
 
  console.log(data );
   $http.post("http://localhost:8080/DoAnCuoiKy/sanpham/getdmsanpham",data)
    .then(function(response) {
      $scope.getsptheoloai = response.data;
      console.log( $scope.getsptheoloai) ;
 $scope.totalItems = $scope.getsptheoloai.length;
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
     return Math.ceil($scope.getsptheoloai.length / $scope.itemsPerPage);
   };

   $scope.$watch('currentPage + itemsPerPage', function() {
     var begin = (($scope.currentPage - 1) * $scope.itemsPerPage),
     end = begin + $scope.itemsPerPage;

     $scope.filtergetsptheoloai = $scope.getsptheoloai.slice(begin, end);
   });


    });

};
$scope.getmenu = function(){
    var data = {
      ma_danh_muc : "1"
    }
    $http.post("http://localhost:8080/DoAnCuoiKy/loaisanpham/menu",data)
    .then(function(response) {
      $scope.getmenunam = response.data;
      console.log( $scope.getmenunam) ;
    });
  };
  $scope.getmenunu = function(){
    var data = {
      ma_danh_muc : "2"
    }
    $http.post("http://localhost:8080/DoAnCuoiKy/loaisanpham/menu",data)
    .then(function(response) {
      $scope.getmenunu= response.data;
      console.log( $scope.getmenunu) ;
    });
  };

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
myApp.config(function($locationProvider) {
  $locationProvider.html5Mode({
    enabled: true,
    requireBase: false,
    rewriteLinks : false
  });   
});
