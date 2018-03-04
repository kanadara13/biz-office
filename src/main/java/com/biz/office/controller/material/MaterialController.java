package com.biz.office.controller.material;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.domain.material.Material;
import com.biz.office.domain.response.ApiResponse;
import com.biz.office.service.material.MaterialService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class MaterialController {

    private MaterialService service;

    @Inject
    public MaterialController(MaterialService service) {
        this.service = service;
    }

    @GetMapping("/v1/material")
    public ApiResponse find(CriteriaRequest request, Pageable pageable){
        return ApiResponse.ok(service.find(request, pageable));
    }

    @PostMapping("/v1/material")
    public ApiResponse save(@RequestBody Material material){
        return ApiResponse.ok(service.save(material));
    }

}
