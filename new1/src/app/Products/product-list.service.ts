import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ProductListInterface } from 'src/app/Products/product-list.interface';

@Injectable({
  providedIn: 'root'
})
export class ProductListService {

  products:ProductListInterface[];
  constructor(private httpClient:HttpClient) { }

    /***
	 * Author:Meghana Nelakuditi
	 * Created on :13-07-2019
	 * MethodNamegetProductList
	 * Parameters: None
	 * return value:None
	 * purpose:To display the list of products in a table;
	 *
	 */
  getProductList():Observable<ProductListInterface[]>{
    
    return this.httpClient.get<ProductListInterface[]>("../assets/products.json");

  }
  deleteProduct(product){
    let index = this.products.indexOf(product);
    this.products.splice(index, 1);
  }

}
