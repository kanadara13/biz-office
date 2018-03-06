package com.biz.office.domain.item;

import com.biz.office.domain.option.OptionComponent;
import com.biz.office.domain.price.Price;
import com.biz.office.domain.base.BaseDomain;
import com.google.common.collect.Lists;

import javax.persistence.*;
import java.util.List;

@Entity
public class Item extends BaseDomain {

    @Column
    private String name;

    @Embedded
    private Price price;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemId", insertable = false, updatable = false)
    private List<ItemComponent> itemComponents = Lists.newArrayList();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemId", insertable = false, updatable = false)
    private List<OptionComponent> optionComponents = Lists.newArrayList();

    public List<OptionComponent> getOptionComponents() {
        return optionComponents;
    }

    public void setOptionComponents(List<OptionComponent> optionComponents) {
        this.optionComponents = optionComponents;
    }

    public List<ItemComponent> getItemComponents() {
        return itemComponents;
    }

    public void setItemComponents(List<ItemComponent> itemComponents) {
        this.itemComponents = itemComponents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
