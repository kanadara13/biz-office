package com.biz.office.service.product;

import com.biz.office.domain.product.Product;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class ProductService {

    private ProductCriteria criteria;
    private ProductManager manager;

    @Inject
    public ProductService(ProductCriteria criteria, ProductManager manager) {
        this.criteria = criteria;
        this.manager = manager;
    }

    public Product save(Product product) {
        return manager.save(product);
    }
}
