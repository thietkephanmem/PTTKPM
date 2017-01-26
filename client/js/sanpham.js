var myApp = angular.module('myApp', []);
myApp.controller('enventCtrl', function($scope, $http) {

        	$scope.getEventNew = function() {
            // $scope.R_date = function ( date){
            //
            //     var datesql = new Date(date.substr(0, 4), date.substr(5, 2)-1 , date.substr(8, 2)) ;
            //     $scope.fulldate =datesql;
            //
            // };

            $http.get("http://localhost:8080/DoAnCuoiKy/sanpham/list")
            .then(function(response) {
                //console.log($filter('date')(new Date(), 'yyyy-MM-dd'));
                $scope.sanpham = response.data;
                console.log($scope.sanpham);
                // for (var i = 0; i < response.data.length; i++) {
                    // var datesql = new Date(response.data[i].startDate);
                    // var datesql= response.data[i].startDate;
                    // var datesystem = new Date();
                   // console.log(datesqlA);

                // }
            });
        };
        });
