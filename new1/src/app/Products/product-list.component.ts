import { Component, OnInit } from '@angular/core';
import { ProductListService } from '../Products/product-list.service';
import { ProductListInterface } from '../Products/product-list.interface';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products:ProductListInterface[];
    constructor(private productListService:ProductListService) { }

  ngOnInit() {
    this.productListService.getProductList().
    subscribe((product)=>this.products=product);
    
  }
  /***
	 * Author:Meghana Nelakuditi
	 * Created on :13-07-2019
	 * MethodName:deleteProduct
	 * Parameters: product
	 * return value:None
	 * purpose:To delete the product from table;
	 *
	 */
  deleteProduct(product){
    let index = this.products.indexOf(product);
    this.products.splice(index, 1);
  }
 
}
