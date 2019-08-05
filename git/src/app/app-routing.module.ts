import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about.component';
import { DashboardComponent } from './dashboard.component';
import { ContactComponent } from './contact.component';

const routes: Routes = [
  {path:'home',component:DashboardComponent},
  {path:'about',component:AboutComponent},
  {path:'contact',component:ContactComponent}
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
