package com.biz.office.repository.item;

import com.biz.office.domain.item.Item;
import com.biz.office.domain.item.ItemComponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentRepository extends JpaRepository<ItemComponent, Long> {
}