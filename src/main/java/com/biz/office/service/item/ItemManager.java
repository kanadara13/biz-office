package com.biz.office.service.item;

import com.biz.office.domain.item.Item;
import com.biz.office.repository.item.ComponentRepository;
import com.biz.office.repository.item.ItemRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class ItemManager {

    private final ItemRepository itemRepository;
    private final ComponentRepository componentRepository;

    @Inject
    public ItemManager(ItemRepository repository, ComponentRepository componentRepository1) {
        this.itemRepository = repository;
        this.componentRepository = componentRepository1;
    }

    public Item save(Item item) {
        return itemRepository.save(item);
    }
}
