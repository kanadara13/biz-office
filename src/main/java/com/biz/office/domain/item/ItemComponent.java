package com.biz.office.domain.item;

import com.biz.office.domain.base.BaseDomain;
import com.biz.office.domain.material.Material;
import com.google.common.collect.Lists;

import javax.persistence.*;
import java.util.List;

@Entity
public class ItemComponent extends BaseDomain {

    @Column
    private Long itemId;

    @Column
    private Long materialId;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getMaterialId() { return materialId; }

    public void setMaterialId(Long materialId) { this.materialId = materialId; }

}
