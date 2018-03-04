package com.biz.office.service.item;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ItemServiceTest {

    private ItemService  service;
    private ItemManager register;
    private ItemCriteria finder;

    @Before
    public void setUp() throws Exception {
        register = mock(ItemManager.class);
        finder   = mock(ItemCriteria.class);
        service = new ItemService(finder, register);
    }


    @Test
    public void save() {

    }
}