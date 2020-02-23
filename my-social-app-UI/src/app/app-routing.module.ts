import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EventsComponent } from './events/events.component';


const routes: Routes = [
  {
    path:'home',
    component:DashboardComponent
  },
  {
    path:'',redirectTo:'/home',pathMatch:'full'
  },
  {
    path: 'events',
    component: EventsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
