package com.biz.office.domain.option;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.repository.option.OptionRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
public class OptionCriteria {

    private OptionRepository repository;

    @Inject
    public OptionCriteria(OptionRepository repository) {
        this.repository = repository;
    }

    public Page<Option> find(CriteriaRequest request, Pageable pageable) {
        return repository.findAll(pageable);
    }
}
