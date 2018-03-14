package com.biz.office.service.order;

import com.biz.office.domain.order.Order;
import com.biz.office.repository.order.OrderRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class OrderCriteria {

    private OrderRepository orderRepository;

    @Inject
    public OrderCriteria(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Page<Order> find(OrderCriteria criteria, Pageable pageable) {
        return orderRepository.findAll(pageable);
    }
}
