

export interface events{
    name:String;
    location:String;
    date:String;
    duration:String;

}

export interface Groups{
    name:String;
    location:String;
    join:String;
    members:Number;

}

export interface UserModel{
    hours:Number;
    grade:String;
    name:String;
    motivation:String;
    introduction:String;
    userId:number;
    event:Array<Event>;
    groups:Array<Groups>;
}