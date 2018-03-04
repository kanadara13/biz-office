package com.biz.office.service.item;

import com.biz.office.domain.item.Item;
import com.biz.office.domain.price.Price;
import com.biz.office.repository.item.ItemRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemRegisterTest {

    private ItemManager register;
    @Inject private ItemRepository repository;

    @Before
    public void setUp() throws Exception {
        register = new ItemManager(repository);
    }

    @Test
    public void saveTest(){
        Item item = new Item();
        item.setName("test-item");
        item.setOptionId(1L);
        Price price = new Price();
        price.setUnitPrice(2000);
        price.setSalePrice(3000);
        item.setPrice(price);
        Item inserted = register.save(item);
        assertEquals(inserted.getName(), item.getName());
        assertEquals(item.getPrice().getSalePrice(), item.getPrice().getSalePrice());
    }
}