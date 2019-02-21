printDetail([{ firstName: "Vinod", lastName: "Valkunde", salary: 123123 }, { firstName: "rohit", lastName: "pawar", salary: 1222 }]);
function printDetail(Customer) {
    for (var c in Customer) {
        console.log(Customer[c].firstName + " " + Customer[c].lastName + " " + Customer[c].salary);
        // console.log(c.firstName+" "+c.lastName+" "+c.salary);
    }
}
