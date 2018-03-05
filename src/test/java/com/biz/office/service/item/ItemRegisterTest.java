package com.biz.office.service.item;

import com.biz.office.domain.item.Item;
import com.biz.office.domain.item.ItemComponent;
import com.biz.office.domain.price.Price;
import com.biz.office.repository.item.ItemComponentRepository;
import com.biz.office.repository.item.ItemRepository;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemRegisterTest {

    private ItemManager register;
    @Inject private ItemRepository repository;
    @Inject private ItemComponentRepository repository2;

    @Before
    public void setUp() throws Exception {
        register = new ItemManager(repository, repository2);
    }

    @Test
    public void saveTest(){
        Item item = new Item();
        item.setName("test-item");
        Price price = new Price();
        price.setUnitPrice(2000);
        price.setSalePrice(3000);
        item.setPrice(price);
        List<ItemComponent> componentList = Lists.newArrayList();
        ItemComponent component = new ItemComponent();
        component.setMaterialId(2L);
        ItemComponent component2 = new ItemComponent();
        component2.setMaterialId(3L);
        componentList.add(component);
        componentList.add(component2);
        item.setItemComponents(componentList);
        Item inserted = register.save(item);
        assertEquals(inserted.getName(), item.getName());
        assertEquals(item.getPrice().getSalePrice(), item.getPrice().getSalePrice());
    }
}