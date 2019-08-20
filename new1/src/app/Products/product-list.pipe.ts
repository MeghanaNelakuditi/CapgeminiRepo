import { Pipe, PipeTransform } from '@angular/core';
import { ProductListInterface } from '../Products/product-list.interface';

@Pipe({
  name: 'productList'
})
export class ProductListPipe implements PipeTransform {

  transform(products:ProductListInterface[], search:any):ProductListInterface[]{
    
   return products.filter(product=>(product.name.startsWith(search))|| 
  (product.category.startsWith(search)) );
  }

}
