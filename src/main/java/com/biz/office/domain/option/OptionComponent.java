package com.biz.office.domain.option;

import com.biz.office.domain.base.BaseDomain;
import com.biz.office.domain.item.Item;
import com.google.common.collect.Lists;

import javax.persistence.*;
import java.util.List;

@Entity
public class OptionComponent extends BaseDomain {

    @Column
    private Long itemId;

    @Column
    private Long optionId;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

}
