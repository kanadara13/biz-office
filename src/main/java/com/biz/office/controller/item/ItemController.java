package com.biz.office.controller.item;

import com.biz.office.domain.item.Item;
import com.biz.office.domain.item.ItemCriteriaRequest;
import com.biz.office.domain.response.ApiResponse;
import com.biz.office.service.item.ItemService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class ItemController {

    private ItemService itemService;

    @Inject
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/v1/item")
    public ApiResponse find(ItemCriteriaRequest criteria, Pageable pageable){
        return ApiResponse.ok(itemService.find(criteria, pageable));
    }

    @PostMapping("/v1/item")
    public ApiResponse save(@RequestBody Item item){
        return ApiResponse.ok(itemService.save(item));
    }
}
