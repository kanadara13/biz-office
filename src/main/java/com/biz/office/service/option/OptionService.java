package com.biz.office.service.option;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.domain.option.Option;
import com.biz.office.domain.option.OptionCriteria;
import com.biz.office.domain.option.OptionManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class OptionService {

    private OptionCriteria criteria;
    private OptionManager manager;

    @Inject
    public OptionService(OptionCriteria criteria, OptionManager manager) {
        this.criteria = criteria;
        this.manager = manager;
    }

    public Page<Option> find(CriteriaRequest request, Pageable pageable) {
        return criteria.find(request, pageable);
    }

    public Option save(Option option) {
        return manager.save(option);
    }
}
