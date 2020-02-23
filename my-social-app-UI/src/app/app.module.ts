import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { GroupsComponent } from './groups/groups.component';
import { EventsComponent } from './events/events.component';
import { LayoutComponent } from './UI/layout/layout.component';
import { HeaderComponent } from './UI/header/header.component';
import { UiModule} from './UI/UI.module';
import { ChartsModule } from 'ng2-charts';
import { PieChartComponent } from './pieChart/pieChart';
import { ListEventsComponent } from './list-events/list-events.component';
import {MatListModule} from '@angular/material/list';


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    GroupsComponent,
    EventsComponent,
    PieChartComponent,
    ListEventsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    UiModule,
    ChartsModule,
    MatListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
