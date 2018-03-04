package com.biz.office.controller.option;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.domain.option.Option;
import com.biz.office.domain.response.ApiResponse;
import com.biz.office.service.option.OptionService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class OptionController {

    private OptionService optionService;

    @Inject
    public OptionController(OptionService optionService) {
        this.optionService = optionService;
    }

    @GetMapping("/v1/option")
    public ApiResponse find(CriteriaRequest criteria, Pageable pageable){
        return ApiResponse.ok(optionService.find(criteria, pageable));
    }

    @PostMapping("/v1/option")
    public ApiResponse save(@RequestBody Option option){
        return ApiResponse.ok(optionService.save(option));
    }
}
