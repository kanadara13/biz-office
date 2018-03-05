package com.biz.office.domain.option;

import com.biz.office.domain.base.BaseDomain;
import com.biz.office.domain.item.Item;
import com.biz.office.domain.price.Price;
import com.google.common.collect.Lists;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="`option`")
public class Option extends BaseDomain {

    @Column
    private String name;

    @Embedded
    private Price price;

 /*   @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "option")
    private List<Item> items  = Lists.newArrayList();

    public List<Item> getItems() {
        return items;
    }*/

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
