package com.biz.office.service.product;

import com.biz.office.domain.channel.Channel;
import com.biz.office.domain.price.Price;
import com.biz.office.domain.product.Product;
import com.biz.office.domain.product.ProductComponent;
import com.biz.office.repository.product.ProductComponentRepository;
import com.biz.office.repository.product.ProductRepository;
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
public class ProductManagerTest {

    private ProductManager register;
    @Inject
    private ProductRepository repository;
    @Inject private ProductComponentRepository repository2;

    @Before
    public void setUp() throws Exception {
        register = new ProductManager(repository, repository2);
    }

    @Test
    public void saveTest(){
        Product product = new Product();
        product.setName("test-product");
        Channel channel = new Channel();
        channel.setId(1l);
        product.setChannel(channel);
        product.setChannelProductId("111ssvb");
        List<ProductComponent> components = Lists.newArrayList();
        Price price = new Price();
        price.setUnitPrice(2000);
        price.setSalePrice(3000);
        ProductComponent component = new ProductComponent();
        component.setOptionId(2L);
        component.setPrice(price);
        ProductComponent component2 = new ProductComponent();
        component2.setOptionId(3L);
        component2.setPrice(price);
        components.add(component);
        components.add(component2);
        product.setComponents(components);
        Product inserted = register.save(product);
        assertEquals(inserted.getName(), product.getName());
    }
}