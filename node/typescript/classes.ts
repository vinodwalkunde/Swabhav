class point{
    private _X:number;
    private _Y:number;

    constructor(X:number,Y:number){
        this._X=X;
        this._Y=Y;
    }
    public get X(){
        return this._X;
    }
    public get Y(){
        return this._Y;
    }
}
let P1=new point(10,20);
console.log(P1.X)
console.log(P1.Y)