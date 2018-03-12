package com.biz.office.domain.order;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Client {

    @Column
    private String buyer;

    @Column
    private String buyerContact;

    @Column
    private String recipient;

    @Column
    private String recipientContact;

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getBuyerContact() {
        return buyerContact;
    }

    public void setBuyerContact(String buyerContact) {
        this.buyerContact = buyerContact;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipientContact() {
        return recipientContact;
    }

    public void setRecipientContact(String recipientContact) {
        this.recipientContact = recipientContact;
    }
}
