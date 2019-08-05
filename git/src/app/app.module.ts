import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard.component';

import { AboutComponent } from './about.component';
import { ContactComponent } from './contact.component';
import { AdminpageComponent } from './adminpage.component';
import { DisplayProductComponent } from './display-product.component';
import { RemoveproductComponent } from './removeproduct/removeproduct.component';



@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    AboutComponent,
    ContactComponent,
    AdminpageComponent,
    DisplayProductComponent,
    RemoveproductComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
