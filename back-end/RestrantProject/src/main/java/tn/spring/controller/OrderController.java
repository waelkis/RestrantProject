package tn.spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.spring.entity.Order;
import tn.spring.service.OrderService;

@RestController
@AllArgsConstructor
@CrossOrigin("http://localhost:4200")
public class OrderController {
	private OrderService orderService;
	
	@GetMapping("/api/allOrders")
	public List<Order> getAllOrder(){
		return orderService.allOrder();
	}

}
