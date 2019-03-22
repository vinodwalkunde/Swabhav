angular.module('swabhavtechlabs', ["ngRoute"])
    .directive('visitingCard', function () {
        return {
            restrict: 'E',
            transclude: true,
            scope: { obj: '=' },
            templateUrl: 'display.html'
        };
    })
    .controller('vistingCardController', function ($scope) {
        $scope.obj =[{
            name:"Vinod",
            address:"Lalbag",
            number:'124356548'
        },
        {
            name:"Rohit",
            address:"Parel",
            number:'9879878876'
        },
    
    ]})
    .controller("visitingCardController",function($scope){
        $scope.obj2=[{
            name:"Vinod",
            address:"Lalbag",
            number:'124356548'
        }]
    })