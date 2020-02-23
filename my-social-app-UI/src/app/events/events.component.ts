import { Component, OnInit } from '@angular/core';
import{EVENTS} from "../mock/mock-events";
import{USERS} from "../mock/mock-user";
import {MatFormFieldModule} from '@angular/material/form-field';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-events',
  templateUrl: './events.component.html',
  styleUrls: ['./events.component.css']
})
export class EventsComponent implements OnInit{
    event_pic: string;
    event_description: string;
    registered: boolean;
    event_name : string;
    user_name : string;
    event_validated : boolean;
    event_id: string;
    user_id : string;
    event_credits:string;
    private REST_API_SERVER = "http://localhost:3000";

    ngOnInit(): void {
      this.event_name = EVENTS.event_name;
      this.event_pic = EVENTS.event_pic;
      this.event_description = EVENTS.event_description;
      this.registered = EVENTS.event_registered;
      this.user_name = "John";
      this.user_id = "123";
      this.event_id = EVENTS.event_id;
      for(var user of USERS){
        if(user.user_name == this.user_name){
          for(var event of user.events){
            // console.log("Event",event);
            if(event.event_name == this.event_name){
              this.event_validated = event.validated;
            }
          }
        }
      }
    }

    is_validated(): boolean{
      return this.event_validated;
    }

    validate(f: NgForm): void{
      this.event_validated = true;
      console.log(f);
      var user_details = {
        'user_id':this.user_id,
        'event_id': this.event_id,
        'validated': this.event_validated
      }
      //return user_details to backend.
    }


}
