package com.biz.office.domain.channel;

import com.biz.office.domain.base.BaseDomain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Channel extends BaseDomain {

    @Column
    private String name;

    @Column
    private String account;

    @Column
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
