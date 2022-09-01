import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { OrderItemComponent } from './componants/order-items/order-item/order-item.component';


@NgModule({
  declarations: [
    AppComponent,
    OrderItemComponent
  ],
  imports: [
    BrowserModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
