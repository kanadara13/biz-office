package com.biz.office.domain.option;

import com.biz.office.repository.option.OptionRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionCriteriaTest {

    @Inject private OptionRepository repository;
    private OptionCriteria criteria;

    @Before
    public void setUp() throws Exception {
        criteria = new OptionCriteria(repository);
    }

    @Test
    @Transactional
    public void findAll() {
        List<Option> optionList = repository.findAll();
        optionList.forEach(e->{
             e.getComponents().forEach(component -> {
                System.out.println(component.getItemId());
            });
        });
    }

    @Test
    @Transactional
    public void findOption() {
        /*List<Option> optionList = repository.findOptions();
        optionList.forEach(e->{
            e.getItems().forEach(item -> {
                System.out.println(item.getName());
            });
        });*/
    }

    @Test
    public void findOne() {
        Option aOption = repository.findOne(1L);
     /*   aOption.getItems().forEach(e->{
            System.out.println(e.getName());
        });*/
    }
}