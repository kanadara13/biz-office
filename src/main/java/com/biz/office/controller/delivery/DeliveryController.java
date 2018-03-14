package com.biz.office.controller.delivery;

import com.biz.office.domain.delivery.Delivery;
import com.biz.office.domain.delivery.DeliveryCompany;
import com.biz.office.domain.response.ApiResponse;
import com.biz.office.service.delivery.DeliveryApiService;
import com.biz.office.service.delivery.DeliveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class DeliveryController {

    private DeliveryApiService apiService;
    private DeliveryService service;

    @Inject
    public DeliveryController(DeliveryApiService deliveryApiService, DeliveryService deliveryService) {
        this.apiService = deliveryApiService;
        this.service = deliveryService;
    }

    @GetMapping("/v1/company")
    public List<DeliveryCompany> find(){
        return apiService.find();
    }

    @PostMapping("/v1/delivery")
    public ApiResponse save(@RequestBody Delivery delivery){
        return ApiResponse.ok(service.save(delivery));
    }

}
