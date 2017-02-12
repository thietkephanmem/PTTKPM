'use strict';


var myApp = angular.module('myApp', ['angularFileUpload'])


   myApp.controller('AppController', function($scope,FileUploader,$http,$location, $rootScope) {


        // code get du lieu
        $scope.getchitietsp = function() {
          var data ={
            
              ma_sp: $location.search()['masp']
            
          }

          console.log($location.search()['masp']);

          $http.post("http://localhost:8080/DoAnCuoiKy/sanpham/findbyid", data)
          .then(function(response) {
            $scope.chitietsp = response.data;
            $rootScope.sanphamroot = $scope.chitietsp;
            // console.log( $scope.chitietsp) ;
            $scope.setdulieusp();
          // console.log("heheh" + $rootScope.sanphamroot);  
          });
        };
        $scope.setdulieusp = function()
        { console.log( $rootScope.sanphamroot);

              $scope.tensp = $rootScope.sanphamroot.ten_sp;
               $scope.gia = $rootScope.sanphamroot.gia;
             $scope.soluong = $rootScope.sanphamroot.tsoluong;
             
               $scope.loaisp = $rootScope.sanphamroot.ma_loai.ma_loai_sp
            
              $scope.ngaynhap = $rootScope.sanphamroot.ngay_nhap;
              $scope.nhasx = $rootScope.sanphamroot.nha_sx.ma_nha_sx;
              $scope.hinh_anh_sp = $rootScope.sanphamroot.hinh_anh;
              $scope.mota = $rootScope.sanphamroot.mo_ta;
              console.log("heheh")
              // console.log("heheh" + $scope.hinh_anh_sp +$scope.mota);
        }
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
          $scope.hinh_anh_sp = "";
          $scope.sethinhanh = function(hinhanh)
          {
             $scope.hinh_anh_sp = hinhanh;
             //              console.log("ssssssssssssss");

             // console.log( $scope.hinh_anh_sp );
          }
          $scope.editProduct = function()
          {
            var data = {
              ma_sp: $location.search()['masp'],
              ten_sp: $scope.tensp,
              gia: $scope.gia,
              soluong: $scope.soluong,
              ma_loai: {
                ma_loai_sp:$scope.loaisp.ma_loai_sp
              },
              ngay_nhap: $scope.ngaynhap,
              nha_sx: {ma_nha_sx:$scope.nhasx.ma_nha_sx},
              hinh_anh: $scope.hinh_anh_sp,
              mo_ta: $scope.mota
            };


            console.log(data) ;
            $http.post('http://localhost:8080/DoAnCuoiKy/sanpham/create',  data)

            .then(function mySucces(response) {
                alert("Thêm thành công");


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
              hinh_anh: $scope.hinh_anh_sp,
              mo_ta: $scope.mota
            };


            console.log(data) ;
            $http.post('http://localhost:8080/DoAnCuoiKy/sanpham/create',  data)

            .then(function mySucces(response) {
                alert("Thêm thành công");


            });
          };
        // end code


        var uploader = $scope.uploader = new FileUploader({
            url: 'upload.php'
        });

        // FILTERS
      
        // a sync filter
        uploader.filters.push({
            name: 'syncFilter',
            fn: function(item /*{File|FileLikeObject}*/, options) {
                console.log('syncFilter');
                return this.queue.length < 10;
            }
        });
      
        // an async filter
        uploader.filters.push({
            name: 'asyncFilter',
            fn: function(item /*{File|FileLikeObject}*/, options, deferred) {
                console.log('asyncFilter');
                setTimeout(deferred.resolve, 1e3);
            }
        });

        // CALLBACKS

        uploader.onWhenAddingFileFailed = function(item /*{File|FileLikeObject}*/, filter, options) {
            console.info('onWhenAddingFileFailed', item, filter, options);
        };
        uploader.onAfterAddingFile = function(fileItem) {
            console.info('onAfterAddingFile', fileItem);
        };
        uploader.onAfterAddingAll = function(addedFileItems) {
            console.info('onAfterAddingAll', addedFileItems);
        };
        uploader.onBeforeUploadItem = function(item) {
            console.info('onBeforeUploadItem', item);
        };
        uploader.onProgressItem = function(fileItem, progress) {
            console.info('onProgressItem', fileItem, progress);
        };
        uploader.onProgressAll = function(progress) {
            console.info('onProgressAll', progress);
        };
        uploader.onSuccessItem = function(fileItem, response, status, headers) {
            console.info('onSuccessItem', fileItem, response, status, headers);
        };
        uploader.onErrorItem = function(fileItem, response, status, headers) {
            console.info('onErrorItem', fileItem, response, status, headers);
        };
        uploader.onCancelItem = function(fileItem, response, status, headers) {
            console.info('onCancelItem', fileItem, response, status, headers);
        };
        uploader.onCompleteItem = function(fileItem, response, status, headers) {
            console.info('onCompleteItem', fileItem, response, status, headers);
        };
        uploader.onCompleteAll = function() {
            console.info('onCompleteAll');
        };

        console.info('uploader', uploader);
    });
myApp.config(function($locationProvider) {
  $locationProvider.html5Mode({
    enabled: true,
    requireBase: false,
    rewriteLinks : false
  });   
});