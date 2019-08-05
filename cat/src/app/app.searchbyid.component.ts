import { Component } from '@angular/core';
import { EmployeeService } from './app.employeeService';

@Component({
  selector: 'app-search-by-id',
  templateUrl: './app.add-employee.component.html'
})
export class SearchByIdComponent  {
    model:any={};
    constructor(private service:EmployeeService) { }
    searchEmployee(data)
    {
    this.service.getEmployeeById(data).subscribe((data:any)=>this.model=data);
 
    }
    

}

