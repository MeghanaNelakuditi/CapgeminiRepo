import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchProductComponent } from './Products/search-product.component';
import { ProductListComponent } from './Products/product-list.component';
import { PageNotFoundComponent } from './Products/page-not-found.component';

const routes: Routes = [
  {path:'searchProduct',component:SearchProductComponent},
  {path:'listProducts',component:ProductListComponent},
  {path:'',redirectTo:'/searchProduct',pathMatch:'full'},
  {path:'**',component:PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
