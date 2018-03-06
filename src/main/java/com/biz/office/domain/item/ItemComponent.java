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

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /*

*/
    @Column
    private Long materialId;

   /*

    @ManyToOne(fetch = FetchType.LAZY)
    private Material material;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
*/
 /*
*/
    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }
}
