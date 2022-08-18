package tn.spring.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.spring.dao.OrderDao;

@AllArgsConstructor
@Service
public class OrderService {
	private OrderDao orderDao;
	

}
