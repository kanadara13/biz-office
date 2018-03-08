package com.biz.office.controller.channel;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.domain.channel.Channel;
import com.biz.office.domain.response.ApiResponse;
import com.biz.office.service.channel.ChannelService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class ChannelController {

    private ChannelService service;

    @Inject
    public ChannelController(ChannelService service) {
        this.service = service;
    }

    @GetMapping("/v1/channel")
    public ApiResponse find(CriteriaRequest criteria, Pageable pageable){
        return ApiResponse.ok(service.find(criteria, pageable));
    }

    @PostMapping("/v1/channel")
    public ApiResponse save(@RequestBody Channel channel){
        return ApiResponse.ok(service.save(channel));
    }
}
