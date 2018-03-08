package com.biz.office.service.channel;

import com.biz.office.domain.channel.Channel;
import com.biz.office.repository.channel.ChannelRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChannelManagerTest {

    private ChannelManager manager;

    @Inject private ChannelRepository repository;

    @Before
    public void setUp() throws Exception {
        manager = new ChannelManager(repository);
    }

    @Test
    public void save() {
        Channel channel = new Channel();
        channel.setName("판매채널1");
        channel.setAccount("admin-account");
        channel.setPassword("password1234");
        manager.save(channel);
    }
}