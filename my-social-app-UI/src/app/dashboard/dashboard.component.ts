import { Component, OnInit } from '@angular/core';
import { UserModel } from '../models/users';

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
    userId:1
  };

  constructor() { }

  ngOnInit(): void {
    
  }

}
