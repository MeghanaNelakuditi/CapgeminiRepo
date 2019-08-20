import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { FormsModule } from "@angular/forms";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { ProductListComponent } from './Products/product-list.component';
import { SearchProductComponent } from './Products/search-product.component';
import { PageNotFoundComponent } from './Products/page-not-found.component';
import { ProductListPipe } from './Products/product-list.pipe';

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    SearchProductComponent,
    PageNotFoundComponent,
    ProductListPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
