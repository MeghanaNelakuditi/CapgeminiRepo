import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl,FormBuilder, Validators } from "@angular/forms";
@Component({
  selector: 'app-model-form',
  templateUrl: './model-form.component.html',
  styleUrls: ['./model-form.component.css']
})
export class ModelFormComponent implements OnInit {

  userForm:FormGroup;

  constructor(private formBuilder:FormBuilder) {
    /* this.userForm=new FormGroup({
      name:new FormControl("Anil", [Validators.required, Validators.minLength(4)]),
      email:new FormControl(),
      address:new FormGroup({
      street: new FormControl(),
        city:new FormControl(),
        pincode:new FormControl(null,Validators.pattern("^[5-7][0-9]{5}$"))
      })
    }) */
    this.userForm=formBuilder({
    name:["Anil",[Validators.required,Validators.minLength(4)]],
    email:[],
      address:formBuilder({
        street:[],
        city:[],
        pincode:[null,Validators.pattern("^[5-7][0-9]{5}$")]

      })
    
    
    })
   }

  ngOnInit() {
  }
  onSubmit(){
    console.log(this.userForm.value);
  }

}
