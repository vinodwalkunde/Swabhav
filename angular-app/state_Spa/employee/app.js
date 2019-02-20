angular.module("SwabhavTechLab", ["ui.router"])
    .config(
        function ($stateProvider, $urlRouterProvider) {
            $stateProvider
                .state('form', {
                    url: '/form',
                    templateUrl: 'partial/form.html',
                    controller: 'employeeController'
                })
                .state('display', {
                    url: '/display',
                    templateUrl: 'partial/display.html',
                    controller: 'employeeController'
                })
                $urlRouterProvider.otherwise('form')
        })
    .factory('EmployeeService', ['$log', '$q', '$http', function ($log, $q, $http) {
        var employeeService = {};
        let employeeObjectArray = [];
        employeeService.getEmployeeData = function () {
            return $q(function (resolve, reject) {
                $http({
                    method: 'GET',
                    url: 'https://swabhav-tech.firebaseapp.com/emp.txt'
                }).then(function (response) {

                    var responseData = response.data;

                    responseData = responseData.replace(/'/g, '');
                    let EmployeeArray = responseData.split('\n');
                    for (var i = 0; i < EmployeeArray.length; i++) {
                        EmployeeArray[i] = EmployeeArray[i].replace(/\s+/g, "");
                    }
                    EmployeeArray = EmployeeArray.filter(function (value, index, self) {
                        return self.indexOf(value) == index;
                    })
                    for (let i = 0; i < EmployeeArray.length; i++) {
                        let row = EmployeeArray[i].split(",");
                        let employeeObject = {
                            id: parseInt(row[0]),
                            name: row[1],
                            designation: row[2],
                            mangerId: parseInt(row[3]),
                            joiningDate: row[4],
                            salary: parseInt(row[5]),
                            commission: parseInt(row[6]),
                            departmentId: parseInt(row[7])
                        }
                        employeeObjectArray.push(employeeObject);
                    }
                    console.log(employeeObjectArray);
                    resolve(employeeObjectArray)
                })
            })
        }
        // employeeService
        return employeeService;
    }])