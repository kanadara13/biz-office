package com.biz.office.controller.order;

import com.biz.office.domain.order.Order;
import com.biz.office.domain.response.ApiResponse;
import com.biz.office.service.order.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class OrderController {

    private OrderService service;

    @Inject
    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping("/v1/order")
    public ApiResponse save(@RequestBody  Order order){
        return ApiResponse.ok(service.save(order));
    }

}
