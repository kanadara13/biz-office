package com.biz.office.controller.order;

import com.biz.office.domain.order.Order;
import com.biz.office.domain.response.ApiResponse;
import com.biz.office.service.order.OrderCriteria;
import com.biz.office.service.order.OrderService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/v1/order")
    public ApiResponse find(OrderCriteria criteria, Pageable pageable){
        return ApiResponse.ok(service.find(criteria, pageable));
    }

    /*@GetMapping("/v1/order/")
    public ApiResponse find(OrderCriteria criteria, Pageable pageable){
        return ApiResponse.ok(service.find(criteria, pageable));
    }*/
}
