package com.biz.office.service.item;

import com.biz.office.domain.item.Item;
import com.biz.office.domain.item.ItemCriteriaRequest;
import com.biz.office.repository.item.ItemRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class ItemCriteria {

    private ItemRepository repository;

    @Inject
    public ItemCriteria(ItemRepository repository) {
        this.repository = repository;
    }

    public Page<Item> find(ItemCriteriaRequest request, Pageable pageable) {
        return repository.findAll(pageable);
    }
}
