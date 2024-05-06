package com.abc.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.order.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{

}
