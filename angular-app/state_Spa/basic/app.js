angular.module("SwabhavTechLab", ["ui.router"])
    .config(
        function ($stateProvider,$urlRouterProvider) {
        $stateProvider
        .state('home',{
            url:'/home',
            templateUrl:'partial/home.html',
            controller:'HomeController'
        })
        .state('about',{
            url:'/about',
            templateUrl:'partial/about.html',
            controller:'AboutController'
        })
        .state('career',{
            url:'/career',
            templateUrl:'partial/career.html',
            controller:'CareerController'
        })
        $urlRouterProvider.otherwise('/home')
    })