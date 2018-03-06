package com.biz.office.domain.option;

import com.biz.office.repository.option.OptionComponentRepository;
import com.biz.office.repository.option.OptionRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Component
public class OptionManager {

    private OptionRepository repository;
    private OptionComponentRepository optionComponentRepository;

    @Inject
    public OptionManager(OptionRepository repository, OptionComponentRepository componentRepository) {
        this.repository = repository;
        this.optionComponentRepository = componentRepository;
    }

    @Transactional
    public Option save(Option option) {
        Option inserted = repository.save(option);
        option.getComponents().stream().forEach(e->e.setOptionId(inserted.getId()));
        inserted.setComponents(optionComponentRepository.save(option.getComponents()));
        return inserted;
    }
}
