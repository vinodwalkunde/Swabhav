angular.module("SwabhavTechLab")
    .controller('employeeController', ["$scope", "EmployeeService", function ($scope, EmployeeService) {
        let array = [];
        let objArray = [];
        var designation = [];
        var departmentId = [];
        let employeeObjectArray = [];
        $scope.empArray = [];
        $scope.design = [];
        $scope.EmployeeData = [];
        $scope.mangerId = [];
        $scope.departmentId = [];

        EmployeeService.getEmployeeData()
            .then((r) => {
                $scope.empArray = r;
                // console.log($scope.empArray);
                for (var i = 0; i < $scope.empArray.length; i++) {
                    designation.push($scope.empArray[i].designation)
                    $scope.mangerId.push($scope.empArray[i].id)
                    departmentId.push($scope.empArray[i].departmentId)
                }

                designation = designation.filter(function (value, index, self) {
                    return self.indexOf(value) == index;
                })
                $scope.design = designation;

                departmentId = departmentId.filter(function (value, index, self) {
                    return self.indexOf(value) == index;
                })
                $scope.departmentId = departmentId;

            })

        $scope.onEditClick = function (value) {

            $scope.selectedId = value.id;
            $scope.selectedName = value.name;
            $scope.selectedDepartmentId = value.departmentId;
            $scope.selectedDesignation = value.designation;
            $scope.selectedManagerId = value.mangerId;
            $scope.selectedjoiningDate = value.joiningDate;
            $scope.selectedSalary = value.salary;
            $scope.selectedCommission = value.commission;

        }
        $scope.removeRow = function (value) {
            if (confirm("Are you sure you want to delete")) {
                console.log(value);
                var index = -1;
                for (let i = 0; i < $scope.empArray.length; i++) {
                    if ($scope.empArray[i].id == value) {
                        index = i;
                        break;
                    }

                }
                if (index === -1) {
                    alert("Something gone wrong");
                }
                $scope.empArray.splice(index, 1);
            }
        }
        $scope.add = function (event) {
            var date = new Date();
            var randomNumber = date.valueOf();
            $scope.selectedId = randomNumber;

            let EmployeeObject = {
                id: randomNumber,
                name: $scope.selectedName,
                designation: $scope.selectedDesignation,
                mangerId: $scope.selectedManagerId,
                joiningDate: $scope.selectedjoiningDate,
                salary: $scope.selectedSalary,
                commission: $scope.selectedCommission,
                departmentId: $scope.selectedDepartmentId
            }
            $scope.empArray.push(EmployeeObject);

        }
    }])