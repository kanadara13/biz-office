package com.biz.office.service.channel;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.domain.channel.Channel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class ChannelService {

    private ChannelCriteria criteria;
    private ChannelManager manager;

    @Inject
    public ChannelService(ChannelCriteria criteria, ChannelManager manager) {
        this.criteria = criteria;
        this.manager = manager;
    }


    public Page<Channel> find(CriteriaRequest criteriaRequest, Pageable pageable) {
        return criteria.find(criteriaRequest, pageable);
    }

    public Channel save(Channel channel) {
        return manager.save(channel);
    }
}
