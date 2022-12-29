package com.wingsxi.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wingsxi.backend.dto.DroppedItemDTO;
import com.wingsxi.backend.model.Item;
import com.wingsxi.backend.service.ItemService;

@CrossOrigin(origins = "http://localhost:*") // TODO Change crossorigin to frontend port (eg. 3000)
@RestController
@RequestMapping("items")
public class ItemsController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/list")
	public List<Item> listItems() {
		return itemService.listItems();
	}
	
	@GetMapping("/drops")
	public List<DroppedItemDTO> listDroppable() {
		return itemService.listDroppableItems();
	}
}
