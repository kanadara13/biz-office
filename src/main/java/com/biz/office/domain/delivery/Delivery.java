package com.biz.office.domain.delivery;

import com.biz.office.domain.base.BaseDomain;
import com.biz.office.domain.order.OrderComponent;

import javax.persistence.*;

@Entity
public class Delivery extends BaseDomain {

    @ManyToOne(fetch = FetchType.LAZY)
    private OrderComponent orderComponent;

    @Column
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @Column
    private String companyId;

    @Column
    private String externalId;

    public OrderComponent getOrderComponent() {
        return orderComponent;
    }

    public void setOrderComponent(OrderComponent orderComponent) {
        this.orderComponent = orderComponent;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
}
