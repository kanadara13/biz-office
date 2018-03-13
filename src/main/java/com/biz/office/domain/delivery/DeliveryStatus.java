package com.biz.office.domain.delivery;

public enum DeliveryStatus {
    CONFIRM("주문확인"), YET("배송준비중"),SHIIPING("배송중"),DONE("배송완료");

    private String label;

    DeliveryStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
