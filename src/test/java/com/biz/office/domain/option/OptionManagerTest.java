package com.biz.office.domain.option;

import com.biz.office.domain.item.Item;
import com.biz.office.domain.item.ItemComponent;
import com.biz.office.domain.price.Price;
import com.biz.office.repository.item.ItemComponentRepository;
import com.biz.office.repository.item.ItemRepository;
import com.biz.office.repository.option.OptionComponentRepository;
import com.biz.office.repository.option.OptionRepository;
import com.biz.office.service.item.ItemManager;
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
public class OptionManagerTest {

    private OptionManager register;

    @Inject
    private OptionRepository repository;
    @Inject private OptionComponentRepository repository2;

    @Before
    public void setUp() throws Exception {
        register = new OptionManager(repository, repository2);
    }

    @Test
    public void saveTest(){
        Option option = new Option();
        option.setName("test-option");
        Price price = new Price();
        price.setUnitPrice(12000);
        price.setSalePrice(14000);
        option.setPrice(price);
        List<OptionComponent> components = Lists.newArrayList();
        OptionComponent component = new OptionComponent();
        component.setItemId(19L);
        OptionComponent component2 = new OptionComponent();
        component2.setItemId(18L);
        components.add(component);
        components.add(component2);
        option.setComponents(components);
        Option inserted = register.save(option);
        assertEquals(inserted.getName(), option.getName());
        assertEquals(option.getPrice().getSalePrice(), option.getPrice().getSalePrice());
    }
}
