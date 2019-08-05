import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/app.employeeService';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {
  model:any={};
  constructor(private service:EmployeeService) { }

  ngOnInit() {
  }

  deleteEmployee(num):any{
    
      console.log(this.model);
      console.log(num);
      this.service.deleteEmployee(num).subscribe();
   }

}
