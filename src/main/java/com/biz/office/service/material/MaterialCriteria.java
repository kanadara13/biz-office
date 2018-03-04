package com.biz.office.service.material;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.domain.material.Material;
import com.biz.office.repository.material.MaterialRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class MaterialCriteria {

    private MaterialRepository repository;

    @Inject
    public MaterialCriteria(MaterialRepository repository) {
        this.repository = repository;
    }

    public Page<Material> find(CriteriaRequest request, Pageable pageable) {
        return repository.findAll(pageable);
    }
}
