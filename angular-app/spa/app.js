angular.module("SwabhavTechLab", ["ngRoute"])
    .config(
        function ($routeProvider) {
        $routeProvider.when('/',{
            templateUrl:'partial/home.html',
            controller:'HomeController'
        })
        .when('/home',{
            templateUrl:'partial/home.html',
            controller:'HomeController'
        })
        .when('/about',{
            templateUrl:'partial/about.html',
            controller:'AboutController'
        })
        .when('/career',{
            templateUrl:'partial/career.html',
            controller:'CareerController'
        })
    })