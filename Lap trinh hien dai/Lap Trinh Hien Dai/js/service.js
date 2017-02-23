angular.module('cc.autorefresh.demo')
    .factory('delayHTTP', function ($q, $timeout) {
        // interceptor that will fake delays to backend
        return {
            request: function (request) {
                var delayedResponse = $q.defer();
                $timeout(function () {
                    delayedResponse.resolve(request);
                }, 1000);
                return delayedResponse.promise;
            },
            response: function (response) {
                var deferResponse = $q.defer();

                if (response.config.timeout && response.config.timeout.then) {
                    response.config.timeout.then(function () {
                        deferResponse.reject({ status: 0});
                    });
                } else {
                    deferResponse.resolve(response);
                }

                return $timeout(function () {
                    deferResponse.resolve(response);
                    return deferResponse.promise;
                });
            }
        };
    })
    .config(['$httpProvider', function ($httpProvider) {
        $httpProvider.interceptors.push('delayHTTP');
    }])
    .run(function($httpBackend) {

        // whitelist backend calls
        $httpBackend.whenGET(/^\/templates\//).passThrough();
    });