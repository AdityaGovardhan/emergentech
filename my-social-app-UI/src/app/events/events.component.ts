import { Component, OnInit } from '@angular/core';
import{EVENTS} from "../mock/mock-events";
import{USERS} from "../mock/mock-user";
import {MatFormFieldModule} from '@angular/material/form-field';

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
    is_validated : boolean;

    ngOnInit(): void {
      this.event_name = EVENTS.event_name;
      this.event_pic = EVENTS.event_pic;
      this.event_description = EVENTS.event_description;
      this.registered = EVENTS.event_registered;
      this.user_name = "John";
      for(var user of USERS){
        if(user.user_name == this.user_name){
          for(var event of user.events){
            // console.log("Event",event);
            if(event.event_name == this.event_name){
              this.is_validated = event.validated;
            }
          }
        }
      }
    }
}
