package com.biz.office.service.material;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.domain.material.Material;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class MaterialService {

    private MaterialCriteria criteria;
    private MaterialManager manager;

    @Inject
    public MaterialService(MaterialCriteria criteria, MaterialManager manager) {
        this.criteria = criteria;
        this.manager = manager;
    }

    public Material save(Material material) {
        return manager.save(material);
    }

    public Page<Material> find(CriteriaRequest request, Pageable pageable) {
        return criteria.find(request,pageable);
    }
}
