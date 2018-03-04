package com.biz.office.domain.option;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.repository.option.OptionRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

import java.util.List;

import static org.junit.Assert.*;

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
            e.getItems().forEach(item -> {
                System.out.println(item.getName());
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
        aOption.getItems().forEach(e->{
            System.out.println(e.getName());
        });
    }

    @Test
    public void find() {
        Pageable pageable = new Pageable() {
            @Override
            public int getPageNumber() {
                return 0;
            }

            @Override
            public int getPageSize() {
                return 0;
            }

            @Override
            public int getOffset() {
                return 0;
            }

            @Override
            public Sort getSort() {
                return null;
            }

            @Override
            public Pageable next() {
                return null;
            }

            @Override
            public Pageable previousOrFirst() {
                return null;
            }

            @Override
            public Pageable first() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }
        };

        Page<Option> options = criteria.find(new CriteriaRequest() {
            @Override
            public String getKeyword() {
                return null;
            }

            @Override
            public void setKeyword() {

            }
        }, pageable);
        options.forEach(e->{
            System.out.println(e.getName());
            e.getItems().forEach(item -> {
                System.out.println(item.getName());
            });
        });
    }
}