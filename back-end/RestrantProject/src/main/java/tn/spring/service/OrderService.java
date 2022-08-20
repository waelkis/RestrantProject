package tn.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.spring.dao.OrderDao;
import tn.spring.entity.Order;

@AllArgsConstructor
@Service
public class OrderService {
	private OrderDao orderDao;
	
	public List<Order> allOrder(){
		return orderDao.findAll();
	}

}
