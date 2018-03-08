package com.biz.office.service.channel;

import com.biz.office.domain.channel.Channel;
import com.biz.office.repository.channel.ChannelRepository;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class ChannelManager {

    private ChannelRepository repository;

    @Inject
    public ChannelManager(ChannelRepository repository) {
        this.repository = repository;
    }

    public Channel save(Channel channel) {
        return repository.save(channel);
    }
}
