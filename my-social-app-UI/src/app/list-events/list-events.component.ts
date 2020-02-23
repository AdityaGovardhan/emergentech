import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-events',
  templateUrl: './list-events.component.html',
  styleUrls: ['./list-events.component.css']
})
export class ListEventsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  events = [
    {
      id:1,
      name: 'Event A',
      location: 'Tempe',
      date: '10/31/1990',
      hours:5,
      rating:"average",
      status:"verification pending"
    },
    {
      id:2,
      name: 'Event B',
      location: 'Tempe',
      date: '10/31/1990',
      hours:2,
      rating:"Outstanding",
      status:"verified"
    },
  ]
}
