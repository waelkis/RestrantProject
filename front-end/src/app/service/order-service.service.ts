import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from '../models/order';

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {
private baseUrl ="http://localhost:8083/api/allOrders"
  constructor(private http: HttpClient) { }


  getOrder():Observable<Order[]>{


    return this.http.get<Order[]>(this.baseUrl)

  }
}
