const userName: String = "Vinod";
const company: String = "AurionPro";
const age: number = 21;
const isMale: boolean = true;
let userLocation = "mumbai";

const detail = `Employee Name ${userName}
Company ${company}
Age ${age} 
isMale ${isMale}
Location ${userLocation}`

display(detail);

function display(data:String):void{
    console.log(data)
}