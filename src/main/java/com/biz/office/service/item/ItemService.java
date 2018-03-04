package com.biz.office.service.item;

import com.biz.office.domain.item.Item;
import com.biz.office.domain.item.ItemCriteriaRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class ItemService {

    private ItemCriteria criteria;
    private ItemManager  manager;

    @Inject
    public ItemService(ItemCriteria criteria, ItemManager manager) {
        this.criteria = criteria;
        this.manager = manager;
    }

    public Page<Item> find(ItemCriteriaRequest request, Pageable pageable) {
        return criteria.find(request, pageable);
    }

    public Item save(Item item) {
        return manager.save(item);
    }
}
