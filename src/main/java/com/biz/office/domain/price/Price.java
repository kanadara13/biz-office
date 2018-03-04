package com.biz.office.domain.price;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Price {

    @Column
    private int unitPrice;

    @Column
    private int salePrice;

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

}
