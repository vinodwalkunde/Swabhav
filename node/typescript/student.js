"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(firstName, lastName, cgpi) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cgpi = cgpi;
    }
    Object.defineProperty(Student.prototype, "detail", {
        get: function () {
            return "firstName " + this.firstName + "\n        lastName" + this.lastName + "\n        cgpi " + this.cgpi;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
// let c1=new Student("Vinod","Valkunde",10)
// console.log(c1.detail);
