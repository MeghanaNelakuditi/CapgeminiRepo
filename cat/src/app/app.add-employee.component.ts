import { Component } from '@angular/core';
import { EmployeeService } from './app.employeeService';

@Component({
  selector: 'app-add-employee',
  templateUrl: './app.add-employee.component.html'
})
export class AddEmployeeComponent  {
  

  constructor(private service:EmployeeService) { }
  model:any={};
  addEmployee():any{
    console.log(this.model);
    this.service.addEmployee(this.model).subscribe();
  }

 


}
