package com.biz.office.service.product;

import com.biz.office.domain.product.Product;
import com.biz.office.repository.product.ProductComponentRepository;
import com.biz.office.repository.product.ProductRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Component
public class ProductManager {

    private ProductRepository repository;
    private ProductComponentRepository productComponentRepository;

    @Inject
    public ProductManager(ProductRepository repository, ProductComponentRepository componentRepository) {
        this.repository = repository;
        this.productComponentRepository = componentRepository;
    }

    @Transactional
    public Product save(Product product) {
        Product inserted =  repository.save(product);
        product.getComponents().stream().forEach(productComponent -> productComponent.setProductId(inserted.getId()));
        inserted.setComponents(productComponentRepository.save(product.getComponents()));
        return inserted;
    }
}
