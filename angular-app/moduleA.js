angular.module('moduleA', ['moduleB', 'moduleC']).
    controller('controllerA', function ($scope, $rootScope) {
        console.log('Inside Controller A');
        $scope.controllerA = {
            message: "Controller A Says Hello"
        }
        console.log($rootScope)
        $rootScope.company = "Aurionpro";
    });