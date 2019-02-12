angular.module('moduleB', []).
    controller('controllerB', function ($scope, $rootScope) {
        console.log('Inside Controller B');
        $scope.controllerB = {
            message: "Controller B Says Hello"
        }
    });