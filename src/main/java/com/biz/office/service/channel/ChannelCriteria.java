package com.biz.office.service.channel;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.domain.channel.Channel;
import com.biz.office.repository.channel.ChannelRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class ChannelCriteria {

    private ChannelRepository repository;

    @Inject
    public ChannelCriteria(ChannelRepository repository) {
        this.repository = repository;
    }

    public Page<Channel> find(CriteriaRequest criteriaRequest, Pageable pageable) {
        return null;
    }
}
