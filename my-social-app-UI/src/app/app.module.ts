import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { GroupsComponent } from './groups/groups.component';
import { EventsComponent } from './events/events.component';
import { LayoutComponent } from './UI/layout/layout.component';
import { HeaderComponent } from './UI/header/header.component';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';
import { UiModule} from './UI/UI.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatNativeDateModule} from '@angular/material/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {DemoMaterialModule} from './material-module';
import { HttpClientModule } from '@angular/common/http';
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
    DemoMaterialModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    MatNativeDateModule,
    FormsModule,
    HttpClientModule,
    ChartsModule,
    MatListModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
