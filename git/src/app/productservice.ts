// import { Injectable } from "@angular/core";
// import { HttpClient } from "@angular/common/http";

// @Injectable({
//     providedIn:'root'
// })
// export class ProductService{

//     constructor(private http:HttpClient){}

//     getAllProducts(){
//        return this.http.get("");
//     }

//     addProduct(data:any){
//      //let input=new FormData();
//     // input.append("empId",data.id);
//      //input.append("empName",data.name);
//      //input.append("empSalary",data.salary);

//         let input={"name":data.name,"price":data.price,"category":data.category};

//         return this.http.post("",input);
//     }
//     updateEmployee(data:any){
//         let input1={"empId":data.id,"empName":data.name,"empSalary":data.salary};
//          return this.http.put("http://ec2-18-222-51-195.us-east-2.compute.amazonaws.com:9009/emplist/updateEmployee",input1);
//        }
    
//        baseurl='http://ec2-52-14-148-20.us-east-2.compute.amazonaws.com:9009/emplist/deleteById';
//        deleteEmployee(id:number) {
//          console.log("service"+id)
//         return this.http.delete(`${this.baseurl}/${id}` ,{responseType:'text'});
//        }
//        baseurl1='http://ec2-52-14-148-20.us-east-2.compute.amazonaws.com:9009/emplist/searchById';
//        getEmployeeById(id:number){
//          console.log("service"+id);
//         return this.http.get(`${this.baseurl1}/${id}`);
//        }
// }