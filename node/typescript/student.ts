export class Student{
    constructor(private firstName,private lastName,private cgpi){

    }
    get detail(){
        return `firstName ${this.firstName}
        lastName${this.lastName}
        cgpi ${this.cgpi}`
    }
}
// let c1=new Student("Vinod","Valkunde",10)
// console.log(c1.detail);