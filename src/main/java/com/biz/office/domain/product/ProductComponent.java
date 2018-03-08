package com.biz.office.domain.product;

import com.biz.office.domain.base.BaseDomain;
import com.biz.office.domain.option.Option;
import com.biz.office.domain.price.Price;

import javax.persistence.*;

@Entity
public class ProductComponent extends BaseDomain {

    @Column
    private Long productId;

    @Column
    private Long optionId;

    @Embedded
    private Price price;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id", insertable = false, updatable = false, nullable = false)
    private Option option;

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }
}
