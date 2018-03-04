package com.biz.office.domain.item;

import com.biz.office.domain.option.Option;
import com.biz.office.domain.price.Price;
import com.biz.office.domain.base.BaseDomain;

import javax.persistence.*;

@Entity
public class Item extends BaseDomain {

    @Column
    private String name;

    @Embedded
    private Price price;

    @Column(insertable = false, updatable = false)
    private Long optionId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Option option;

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
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
