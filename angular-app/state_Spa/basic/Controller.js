angular.module('SwabhavTechLab')
.controller("HomeController",function($scope){
    console.log("Home Created")
    $scope.data="Home Controller Say Hello";
})
.controller("AboutController",function($scope){
    console.log("About Created")
    $scope.data="About Controller Say Hello";
})
.controller("CareerController",function($scope){
    console.log("Career Created")
    $scope.data="Career Controller Say Hello";
})
.controller("contactController",function($scope){
    console.log("Contact Created")
    $scope.data="This is Contact Page";
})
.controller("detailController",function($scope){
    console.log("Detail Created")
    $scope.data="This is detail Page";
})