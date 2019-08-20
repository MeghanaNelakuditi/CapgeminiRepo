import { Component, OnInit } from '@angular/core';
import { ProductListService } from '../Products/product-list.service';
import { ProductListInterface } from '../Products/product-list.interface';

@Component({
  selector: 'app-search-product',
  templateUrl: './search-product.component.html',
  styleUrls: ['./search-product.component.css']
})
export class SearchProductComponent implements OnInit {

  products:ProductListInterface[];
  search;
  searchProduct;
  constructor(private productListService:ProductListService) { }

  ngOnInit() {
    this.productListService.getProductList().subscribe((product)=>this.products=product);
  }
  /***
	 * Author:Meghana Nelakuditi
	 * Created on :13-07-2019
	 * MethodName:SearchProduct
	 * Parameters: None
	 * return value:None
	 * purpose:To search the product from table;
	 *
	 */
  searchForm(){
    this.searchProduct=this.search;
  }

}
