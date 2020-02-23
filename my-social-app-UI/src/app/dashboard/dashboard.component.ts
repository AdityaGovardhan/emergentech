import { Component, OnInit } from '@angular/core';
import { UserModel } from '../models/users';
import { UserServiceService} from '../services/user-service.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  user:UserModel={
    hours:21,
    grade:"A",
    name:"Suryanshu",
    motivation:"Environment protection",
    introduction:"a student",
    userId:1,
    event:[],
    groups:[]
  };

  constructor(private userService:UserServiceService) { }

  ngOnInit(): void {

    //this.getUserInfo()
    
  }

  getUserInfo(){
    this.userService.getUser(1)
    .subscribe(user=>{this.user=user;});
  }

}
