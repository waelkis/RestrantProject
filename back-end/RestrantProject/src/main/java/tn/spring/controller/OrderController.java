package tn.spring.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.spring.service.OrderService;

@RestController
@AllArgsConstructor
public class OrderController {
	private OrderService orderService;

}
