package com.micropractice.menuservice.menuservice.repository;

import com.micropractice.menuservice.menuservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
