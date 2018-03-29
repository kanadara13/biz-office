package com.biz.office.service.order;

import com.biz.office.domain.order.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class OrderService {

    private OrderGenerator generator;
    private OrderCriteria  criteria;
    private OrderManager   manager;

    @Inject
    public OrderService(OrderGenerator orderGenerator, OrderCriteria orderCriteria, OrderManager orderManager) {
        this.generator = orderGenerator;
        this.criteria = orderCriteria;
        this.manager = orderManager;
    }

    public Order save(Order order) {
        return generator.generate(order);
    }

    public Page<Order> find(OrderCriteria criteria, Pageable pageable) {
        return criteria.find(criteria, pageable);
    }

}
