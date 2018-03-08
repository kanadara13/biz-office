package com.biz.office.controller.product;

import com.biz.office.domain.channel.Channel;
import com.biz.office.domain.product.Product;
import com.biz.office.domain.response.ApiResponse;
import com.biz.office.service.product.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class ProductController {

    private ProductService service;

    @Inject
    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/v1/product")
    public ApiResponse save(@RequestBody Product product){
        return ApiResponse.ok(service.save(product));
    }
}
