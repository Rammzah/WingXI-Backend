package com.wingsxi.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wingsxi.backend.dto.DroppedItemDTO;
import com.wingsxi.backend.model.Item;

public interface ItemsRepository extends CrudRepository<Item, Integer> {
	
	@Query(value = "SELECT * FROM item_basic", nativeQuery = true)
	public List<Item> listAllItems();
	
	@Query(value = "SELECT mob_groups.name AS 'monsterName', zone_settings.name AS 'zone', item_basic.name AS 'itemName', mob_droplist.itemRate AS 'droprate' FROM mob_droplist \r\n"
			+ "	INNER JOIN item_basic ON (mob_droplist.itemID = item_basic.itemid) \r\n"
			+ "	INNER JOIN mob_groups ON (mob_groups.dropid = mob_droplist.dropId)\r\n"
			+ "	INNER JOIN zone_settings ON (zone_settings.zoneid = mob_groups.zoneid)\r\n"
			+ "WHERE mob_droplist.itemRate != 0\r\n"
			+ "ORDER BY monsterName ASC", nativeQuery = true)
	public List<DroppedItemDTO> listDroppableItems();
}
