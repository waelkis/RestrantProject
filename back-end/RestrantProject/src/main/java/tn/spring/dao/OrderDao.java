package tn.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.spring.entity.Order;
@Repository
public interface OrderDao extends JpaRepository<Order,Long> {

}
