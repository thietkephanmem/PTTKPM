angular.module('cc.autorefresh.demo', ['cc.autorefresh', 'ngMockE2E']);
angular.module("cc.autorefresh.demo").controller("AutoRefreshBtnDemoCtrl", function ($q, $http,$rootScope,$scope) {
    "use strict";
     //xuan thai


     $scope.reload = function(){
         var config = {
            apiKey: "AIzaSyAynpgdgt7unlb3Pvd4hZR0L1Wdz58-Xm8",
            authDomain: "fir-fab57.firebaseapp.com",
            databaseURL: "https://fir-fab57.firebaseio.com",
            storageBucket: "fir-fab57.appspot.com",
            messagingSenderId: "526022320822"
        };
        firebase.initializeApp(config);


        const dboz= firebase.database().ref(); 
        dboz.on('value', snap => console.log(snap.val()));
      
        console.log($rootScope.test);
    };

    // xuan thai end
    var vm = this;

    // function refreshList(cancellationToken) {
    //     var request = {
    //         url: "/items",
    //         method: "GET",
    //         timeout: cancellationToken
    //     };
    //     return $http(request).then(function (response) {
    //         return response.data;
    //     });
    // }

    function setLastRefreshed(list, eventArgs) {
        list.lastRefresh = eventArgs.when;
    }

    function initialise() {
        // vm.refreshList = refreshList;
$rootScope.test=2233;
        vm.lists = [{
            interval: 1000,
            title: "List 1",
            data: $rootScope.test,
            lastRefresh: new Date()
        }];
        vm.lists[0].setLastRefreshed = setLastRefreshed.bind(null, vm.lists[0]);

    }

    initialise();







})
    // .run(function ($httpBackend) {

    //     var counter = 0;
    //     // fakes a backend
    //     $httpBackend.whenGET("/items").respond(function () {
    //         return  [
    //             200,
    //             JSON.stringify(["Item " + (++counter)]),
    //             {},
    //             "OK"
    //         ];
    //     });
    // });