package com.biz.office.service.material;

import com.biz.office.domain.material.Material;
import com.biz.office.repository.material.MaterialRepository;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class MaterialManager {

    private MaterialRepository repository;

    @Inject
    public MaterialManager(MaterialRepository repository) {
        this.repository = repository;
    }

    public Material save(Material material) {
        return repository.save(material);
    }
}
