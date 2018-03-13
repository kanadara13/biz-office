package com.biz.office.domain.delivery;

import com.biz.office.domain.base.BaseDomain;
import com.biz.office.domain.order.OrderComponent;

import javax.persistence.*;

@Entity
public class Delivery extends BaseDomain {

    @ManyToOne(fetch = FetchType.LAZY)
    private OrderComponent orderDetail;

    @Column
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @Column
    private String deliveryCompanyId;

    @Column
    private String externalId;

    public OrderComponent getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderComponent orderDetail) {
        this.orderDetail = orderDetail;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public String getDeliveryCompanyId() {
        return deliveryCompanyId;
    }

    public void setDeliveryCompanyId(String deliveryCompanyId) {
        this.deliveryCompanyId = deliveryCompanyId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
}
