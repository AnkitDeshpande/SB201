package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.NotFoundException;
import com.masai.model.MenuItem;
import com.masai.repository.MenuItemRepository;

@Service
public class MenuItemService {
	@Autowired
	private MenuItemRepository menuItemRepository;

	public List<MenuItem> getAllMenuItems() {
		return menuItemRepository.findAll();
	}

	public MenuItem getMenuItemById(Long id) {
		return menuItemRepository.findById(id).orElseThrow(() -> new NotFoundException("Menu item not found"));
	}

	public MenuItem createMenuItem(MenuItem menuItem) {
		return menuItemRepository.save(menuItem);
	}

	public MenuItem updateMenuItem(Long id, MenuItem updatedMenuItem) {
		MenuItem existingMenuItem = menuItemRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Menu item not found"));

		existingMenuItem.setName(updatedMenuItem.getName());
		existingMenuItem.setDescription(updatedMenuItem.getDescription());
		existingMenuItem.setPrice(updatedMenuItem.getPrice());

		return menuItemRepository.save(existingMenuItem);
	}

	public String deleteMenuItem(Long id) {
		MenuItem menuItem = menuItemRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Menu item not found"));

		menuItemRepository.delete(menuItem);
		return "Deleted Successfully";
	}
}