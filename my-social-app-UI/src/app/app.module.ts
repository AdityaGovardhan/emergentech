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

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    GroupsComponent,
    EventsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    UiModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
