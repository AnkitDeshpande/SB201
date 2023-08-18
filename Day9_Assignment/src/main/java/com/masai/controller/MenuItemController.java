package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.MenuItem;
import com.masai.service.MenuItemService;

@RestController
public class MenuItemController {
	@Autowired
	private MenuItemService menuItemService;

	@GetMapping("/menuitems")
	public ResponseEntity<List<MenuItem>> getAllMenuItems() {
		List<MenuItem> menuItems = menuItemService.getAllMenuItems();
		return new ResponseEntity<>(menuItems, HttpStatus.OK);
	}

	@GetMapping("/menuitems/{id}")
	public ResponseEntity<MenuItem> getMenuItemById(@PathVariable Long id) {
		MenuItem menuItem = menuItemService.getMenuItemById(id);
		return new ResponseEntity<>(menuItem, HttpStatus.OK);
	}

	@PostMapping("/menuitems")
	public ResponseEntity<MenuItem> createMenuItem(@RequestBody MenuItem menuItem) {
		MenuItem createdMenuItem = menuItemService.createMenuItem(menuItem);
		return new ResponseEntity<>(createdMenuItem, HttpStatus.CREATED);
	}

	@PutMapping("/menuitems/{id}")
	public ResponseEntity<MenuItem> updateMenuItem(@PathVariable Long id, @RequestBody MenuItem updatedMenuItem) {
		MenuItem menuItem = menuItemService.updateMenuItem(id, updatedMenuItem);
		return new ResponseEntity<>(menuItem, HttpStatus.OK);
	}

	@DeleteMapping("/menuitems/{id}")
	public ResponseEntity<String> deleteMenuItem(@PathVariable Long id) {

		return new ResponseEntity<>(menuItemService.deleteMenuItem(id), HttpStatus.NO_CONTENT);
	}
}
