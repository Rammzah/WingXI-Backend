package com.wingsxi.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wingsxi.backend.model.Item;

public interface ItemsRepository extends CrudRepository<Item, Integer> {
	
	@Query(value = "SELECT * FROM item_basic", nativeQuery = true)
	public List<Item> listAllItems();
}
