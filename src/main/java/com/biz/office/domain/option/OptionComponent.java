package com.biz.office.domain.option;

import com.biz.office.domain.base.BaseDomain;
import com.biz.office.domain.item.Item;
import com.google.common.collect.Lists;

import javax.persistence.*;
import java.util.List;

@Entity
public class OptionComponent extends BaseDomain {

    @Column(insertable = false, updatable = false)
    private Long itemId;

    @Column(insertable = false, updatable = false)
    private Long optionId;

  /*  @ManyToOne
    private Item item;

    @ManyToOne
    private Option option;


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
*/
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
