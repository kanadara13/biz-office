package com.biz.office.repository.material;

import com.biz.office.domain.base.CriteriaRequest;
import com.biz.office.domain.material.Material;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material,Long> {

}
