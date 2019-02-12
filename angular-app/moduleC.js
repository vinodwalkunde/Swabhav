angular.module('moduleC', []).
    controller('controllerC', function ($scope, $rootScope) {
        console.log('Inside Controller C');
        $scope.controllerC = {
            message: "Controller C Says Hello"
        }
    });