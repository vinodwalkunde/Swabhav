module.exports=class Customer {
    constructor(firstname, lastname) {
        this.firstname=firstname;
        this.lastname=lastname;
    }
    get fullname(){
        return this.firstname+" "+this.lastname;
    }
}
// let c1=new Customer("Vinod","Valkunde");
// console.log(c1.fullname)
// console.log(c1)
// console.log(c1.__proto__==Customer.prototype)

