import {Component,OnInit} from '@angular/core'
import { EmployeeService } from "./app.employeeService";



@Component({
    selector:'show-app',
    templateUrl:'app.show.html'

})

export class ShowComponent implements OnInit {
    constructor(private service:EmployeeService){}
    empdata:any[]=[];
    ngOnInit(){
        this.service.getAllEmployees().subscribe((data:any)=>this.empdata=data);
    }
}