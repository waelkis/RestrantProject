import { Component, OnInit } from '@angular/core';
import { Order } from 'src/app/models/order';
import { OrderServiceService } from 'src/app/service/order-service.service';

@Component({
  selector: 'app-order-item',
  templateUrl: './order-item.component.html',
  styleUrls: ['./order-item.component.css']
})
export class OrderItemComponent implements OnInit {
 orders:Order [];
  constructor(private order: OrderServiceService) { }

  ngOnInit(): void {
    this.getOrder();
  }

  getOrder(){
    this.order.getOrder().subscribe(
      Data=>{
        this.orders= Data
      }
    )
  }

}
