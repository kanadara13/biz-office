package com.biz.office.service.item;

import com.biz.office.domain.item.Item;
import com.biz.office.repository.item.ItemRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class ItemManager {

    private final ItemRepository repository;

    @Inject
    public ItemManager(ItemRepository repository) {
        this.repository = repository;
    }

    public Item save(Item item) {
        return repository.save(item);
    }
}
