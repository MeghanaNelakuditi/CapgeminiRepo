import {Component} from '@angular/core'
import { EmployeeService } from "./app.employeeService";



@Component({
    selector:'show-app',
    templateUrl:'app.show.html'

})

export class UpdateEmployeeComponent  {
    model:any={};

    
    constructor(private service: EmployeeService) { 

    }
    addEmployee():any{
        console.log(this.model);
        this.service.updateEmployee(this.model).subscribe();
      }
}