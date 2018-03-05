package com.biz.office.service.item;

import com.biz.office.domain.item.Item;
import com.biz.office.repository.item.ItemComponentRepository;
import com.biz.office.repository.item.ItemRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class ItemManager {

    private final ItemRepository itemRepository;
    private final ItemComponentRepository itemComponentRepository;

    @Inject
    public ItemManager(ItemRepository repository, ItemComponentRepository componentRepository) {
        this.itemRepository = repository;
        this.itemComponentRepository = componentRepository;
    }

    public Item save(Item item) {
        Item inserted = itemRepository.save(item);
        inserted.setItemComponents(itemComponentRepository.save(item.getItemComponents()));
        return inserted;
    }
}
