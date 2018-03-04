package com.biz.office.repository.option;


import com.biz.office.domain.option.Option;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionRepository extends JpaRepository<Option,Long> {

}
