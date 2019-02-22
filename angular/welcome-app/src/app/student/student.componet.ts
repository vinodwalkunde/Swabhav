import { Component } from '@angular/core';
import { IStudent } from './IStudent';

@Component({
    selector: 'swabhav-Student',
    templateUrl: './student.componet.html'
})
export class StudentComponent {
    message:String="Inside Inner Html";
    imgUrl:String='https://vignette.wikia.nocookie.net/assassinscreed/images/0/0b/Assassin%27s_Creed_Unity_Cover.jpg/revision/latest?cb=20140610082722';
    // imgUrl:String="../../assets/Vinod.png";
    width:number=200;
    height:number=200;
    course:String[]=[];
    
    private student: IStudent;
    constructor(){
        this.student={cgpi: 4,name: "Vinod",job:"Manger"}
    }
    public get cgpiToColor(){
        return this.student['cgpi']>7?'red':'green';
    }
    public loadCourseData(){
        this.course.push("I.T")
        this.course.push('Comp')
        this.course.push('mech')
        console.log("Button Click")
    }
}