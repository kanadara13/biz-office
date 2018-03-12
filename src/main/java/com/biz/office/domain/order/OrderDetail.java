package com.biz.office.domain.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class OrderDetail {

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    @Column
    private String channelOrderDetailId;

    @Column
    private String orderedChannelProductId;

    @Column
    private String orderedProductName;

    @Column
    private String orderedOptionName;

    @Column
    private int quantity;

    @Column
    private int paymentDetailAmount;

    @Column
    private int discountAmount;

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getPaymentDetailAmount() {
        return paymentDetailAmount;
    }

    public void setPaymentDetailAmount(int paymentDetailAmount) {
        this.paymentDetailAmount = paymentDetailAmount;
    }

    public String getChannelOrderDetailId() {
        return channelOrderDetailId;
    }

    public void setChannelOrderDetailId(String channelOrderDetailId) {
        this.channelOrderDetailId = channelOrderDetailId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getOrderedChannelProductId() {
        return orderedChannelProductId;
    }

    public void setOrderedChannelProductId(String orderedChannelProductId) {
        this.orderedChannelProductId = orderedChannelProductId;
    }

    public String getOrderedProductName() {
        return orderedProductName;
    }

    public void setOrderedProductName(String orderedProductName) {
        this.orderedProductName = orderedProductName;
    }

    public String getOrderedOptionName() {
        return orderedOptionName;
    }

    public void setOrderedOptionName(String orderedOptionName) {
        this.orderedOptionName = orderedOptionName;
    }
}
