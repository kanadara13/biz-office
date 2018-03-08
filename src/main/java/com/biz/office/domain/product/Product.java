package com.biz.office.domain.product;

import com.biz.office.domain.base.BaseDomain;
import com.biz.office.domain.channel.Channel;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product extends BaseDomain {

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Channel channel;

    @Column
    private String channelProductId;

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", insertable = false, updatable = false)
    private List<ProductComponent> components;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public List<ProductComponent> getComponents() {
        return components;
    }

    public void setComponents(List<ProductComponent> components) {
        this.components = components;
    }

    public String getChannelProductId() {
        return channelProductId;
    }

    public void setChannelProductId(String channelProductId) {
        this.channelProductId = channelProductId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
