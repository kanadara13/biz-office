package com.biz.office.domain.material;

import com.biz.office.domain.base.BaseDomain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Material extends BaseDomain {

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
