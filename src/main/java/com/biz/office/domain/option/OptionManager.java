package com.biz.office.domain.option;

import com.biz.office.repository.option.OptionRepository;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class OptionManager {

    private OptionRepository repository;

    @Inject
    public OptionManager(OptionRepository repository) {
        this.repository = repository;
    }

    public Option save(Option option) {
        return repository.save(option);
    }
}
