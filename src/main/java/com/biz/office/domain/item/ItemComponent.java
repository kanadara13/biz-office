package com.biz.office.domain.item;

import com.biz.office.domain.base.BaseDomain;
import com.biz.office.domain.material.Material;
import com.google.common.collect.Lists;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class ItemComponent extends BaseDomain {

    @Column(insertable = false, updatable = false)
    private Long itemId;

    @Column(insertable = false, updatable = false)
    private Long materialId;

    @ManyToMany
    private List<Material> materials = Lists.newArrayList();

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }
}
