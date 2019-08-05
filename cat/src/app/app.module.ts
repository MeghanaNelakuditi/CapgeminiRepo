import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent }  from './app.component';
import { ShowComponent } from "./app.showcomponent";

import { HttpClientModule } from "@angular/common/http";
import { AddEmployeeComponent } from './app.add-employee.component';
import { FormsModule } from "@angular/forms";;
import { DeleteComponent } from './delete.component'
import { UpdateEmployeeComponent } from 'src/app/app.update-employee.component';
import { SearchByIdComponent } from 'src/app/app.searchbyid.component';


@NgModule({
    imports: [
        BrowserModule,
        HttpClientModule,
        FormsModule,
        AppRoutingModule
        
    ],
    declarations: [
        AppComponent,
        ShowComponent,
        AddEmployeeComponent,
        DeleteComponent,
        UpdateEmployeeComponent,
        SearchByIdComponent

        		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }