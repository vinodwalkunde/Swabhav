angular.module('swabhavtechlabs', ["ngRoute"])
    .constant("Url", 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/')
    .directive('studentFooter', function () {
        return {
            restrict: 'E',
            scope: { obj: '=' },
            templateUrl: 'footer.html'
        };
    })
    .directive('studentHeader', function () {
        return {
            templateUrl: "header.html"
        }
    })
    .controller('MyCtrl', function ($scope) {
        $scope.obj = { prop: "AurionPro" };
    })
    .config(
        function ($routeProvider) {
            $routeProvider.when('/', {
                templateUrl: 'partial/login.html',
                controller: 'StudentLoginController'
            })
                .when('/displayStudent', {
                    templateUrl: 'partial/displayStudent.html',
                    controller: 'displayController'
                })
                .when('/homeStudent', {
                    templateUrl: 'partial/homeStudent.html',
                    controller: 'addController'
                })
                .when('/edit/:UID', {
                    templateUrl: 'partial/editForm.html',
                    controller: 'editController'
                })
                .when('/delete/:UID', {
                    templateUrl: 'partial/displayStudent.html',
                    controller: 'deleteController'
                })
                .when('/login', {
                    templateUrl: 'partial/login.html',
                    controller: 'StudentLoginController'
                })
        }
    )
    .factory('StudentService', ['$log', '$q', '$http', '$window', 'Url', '$rootScope', function ($log, $q, $http, $window, Url, $rootScope) {
        var studentService = {};
        $rootScope.isLogin=true;
        // $rootScope.isLogin = false;
        var obj = JSON.parse($window.sessionStorage.getItem("obj"))
        if (obj != null) {
            $rootScope.login = obj.email;
            $rootScope.isLogin=false;
        }
        studentService.getStudentById = function (id) {
            return $q(function (resolve, reject) {
                $http({
                    method: 'GET',
                    url: Url + id
                }).then(function (response) {
                    resolve(response.data);
                })
            })
        }
        studentService.getStudentData = function () {
            return $q(function (resolve, reject) {
                $http({
                    method: 'GET',
                    url: Url
                }).then(function (response) {
                    resolve(response.data);
                })
            })
        }
        studentService.addStudent = function (studentObject) {
            return $q(function (resolve, reject) {
                $http.post(Url, studentObject)
                    .then(function (response) {
                        $window.location.href = "#/displayStudent";
                        // window.location="#/displayStudent";
                        resolve(response)
                    })
            })
        }
        studentService.delete = function (studentId) {
            console.log(studentId);
            return $q(function (resolve, reject) {
                $http.delete(Url + studentId)
                    .then(function (response) {
                        resolve(response)
                    })
            })
        }
        studentService.update = function (studentObject) {
            return $q(function (resolve, reject) {
                $http.put(Url + studentObject.id, studentObject)
                    .then(function (response) {
                        console.log(response)
                        resolve(response);
                    })
            })
        }
        return studentService;
    }])

    .controller("displayController", function ($rootScope,$scope, $window,Url, StudentService) {
        $scope.logout=function(){
            $rootScope.isLogin=false;
            console.log("logout")
            $window.sessionStorage.removeItem("obj");
            $window.location.reload();
        }
        $scope.count;
        $scope.studentArray = [];
        // $window.location.reload();
        console.log(Url)
        StudentService.getStudentData()
            .then((result) => {
                $scope.studentArray = result;
                $scope.count = $scope.studentArray.length;
                console.log($scope.studentArray)
            })
    })
    .controller("addController", function ($scope, StudentService) {
        $scope.studentArray = [];
        $scope.gender = ["MALE", "FEMALE"];
        StudentService.getStudentData()
            .then((result) => {
                $scope.studentArray = result;
                $scope.count = $scope.studentArray.length;
            })
        $scope.add = function () {
            var date = new Date();
            var gender = true;
            var randomNumber = date.valueOf();
            if ($scope.selectedGender == "FEMALE") {
                gender = false
            }
            let studentObject = {
                id: randomNumber,
                rollNo: $scope.selectedRollNo,
                name: $scope.selectedName,
                age: $scope.selectedAge,
                email: $scope.selectedEmail,
                date: $scope.selectedDate,
                gender: gender
            }
            StudentService.addStudent(studentObject)
                .then((result) => {
                    alert("Status:" + result.statusText)

                })


        }
    })
    .controller("editController", function ($scope, $routeParams, $window, StudentService) {
        $scope.id = $routeParams.UID;
        $scope.gender = ["MALE", "FEMALE"];
        $scope.studentArray = [];

        console.log($scope.id);
        var obj = JSON.parse($window.sessionStorage.getItem("obj"))
        if (obj != null) {
            StudentService.getStudentById($scope.id)
                .then((result) => {
                    $scope.studentArray = result;
                    var gender
                    $scope.created_time = new Date($scope.studentArray[0].date)
                    $scope.selectedRollNo = $scope.studentArray[0].rollNo;
                    $scope.selectedName = $scope.studentArray[0].name;
                    $scope.selectedAge = $scope.studentArray[0].age;
                    $scope.selectedEmail = $scope.studentArray[0].email;
                    $scope.selectedDate = $scope.created_time;


                    if ($scope.studentArray[0].isMale == true) {
                        gender = "MALE"
                    } else {
                        gender = "FEMALE";
                    }
                    $scope.selectedGender = gender;
                })
        } else {
            $window.location.href = "#/login"
        }
        $scope.update = function () {

            var gender = true;

            if ($scope.selectedGender == "FEMALE") {
                gender = false
            }
            let studentObject = {
                id: $scope.studentArray[0].id,
                rollNo: $scope.selectedRollNo,
                name: $scope.selectedName,
                age: $scope.selectedAge,
                email: $scope.selectedEmail,
                date: $scope.selectedDate,
                gender: gender
            }
            StudentService.update(studentObject)
                .then((result) => {
                    alert("Status:" + result.statusText)
                })
            $window.location.href = "#/displayStudent";
        }

    })
    .controller("deleteController", function ($scope, $routeParams, $window, StudentService) {
        $scope.id = $routeParams.UID;
        var obj = JSON.parse($window.sessionStorage.getItem("obj"))
        if (obj != null) {
            if (confirm("Do You Really Want Delete")) {
                StudentService.delete($scope.id)
                    .then((result) => {
                        alert("Status:" + result.statusText)
                        // $window.location.href = "#/displayStudent";
                    })
                // $window.location.href = "#/displayStudent";

            }
        } else {
            $window.location.href = "#/displayStudent";
        }
    })

    .factory("Login", function ($window) {
        var login = {}
        login.getStatusofUser = (user, pass) => {

            if (user === pass) {
                var userStatus = {
                    email: user,
                    password: pass,
                    isLoggedIn: true
                }
                $window.sessionStorage.setItem("obj", JSON.stringify(userStatus));
                $window.location.href = "#/displayStudent";
            } else {
                alert("Invalid UserName Or Password")
            }
        }
        return login;
    })
    .controller('StudentLoginController', ['$rootScope', '$scope', '$window', 'Login', function ($rootScope, $scope, $window, Login) {
        $scope.logininput = () => {
            $rootScope.isLogin=false;
            console.log("LogIn")
            $rootScope.login = $scope.username;
            Login.getStatusofUser($scope.username, $scope.password)
        }
        
    }]);