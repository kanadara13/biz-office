package com.biz.office.service.order;

import com.biz.office.domain.order.Order;
import com.biz.office.repository.order.OrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Component
public class OrderGenerator {

    private OrderRepository orderRepository;

    @Inject
    public OrderGenerator(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public Order generate(Order order) {
        return orderRepository.save(order);
    }
}
