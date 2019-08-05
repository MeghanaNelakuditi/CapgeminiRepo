import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeeComponent } from 'src/app/app.add-employee.component';
import { ShowComponent } from 'src/app/app.showcomponent';
import { SearchByIdComponent } from 'src/app/app.searchbyid.component';
import { UpdateEmployeeComponent } from 'src/app/app.update-employee.component';
import { DeleteComponent } from 'src/app/delete.component';


const routes: Routes = [
    {path:"addEmployee",component:AddEmployeeComponent},
    {path:"listEmployees",component:ShowComponent},
    {path:"searchbyid",component:SearchByIdComponent},
    {path:"updateEmployee",component:UpdateEmployeeComponent},
    {path:"deleteEmployee",component:DeleteComponent}
   

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }
function newFunction(): string {
    return "deleteEmployee";
}
