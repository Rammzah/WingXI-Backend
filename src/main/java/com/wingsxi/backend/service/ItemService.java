package com.wingsxi.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wingsxi.backend.dto.DroppedItemDTO;
import com.wingsxi.backend.model.Item;
import com.wingsxi.backend.repository.ItemsRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemsRepository itemRepo;
	
	public List<Item> listItems() {
		return itemRepo.listAllItems();
	}
	
	public List<DroppedItemDTO> listDroppableItems() {
		return itemRepo.listDroppableItems();
	}
}
