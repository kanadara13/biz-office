package com.biz.office.service.order;

import com.biz.office.domain.order.Order;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class OrderService {

    private OrderGenerator generator;
    private OrderCriteria  criteria;
    private OrderManager   manager;

    @Inject
    public OrderService(OrderGenerator generator, OrderCriteria criteria, OrderManager manager) {
        this.generator = generator;
        this.criteria = criteria;
        this.manager = manager;
    }

    public Order save(Order order) {
        return generator.generate(order);
    }
}
