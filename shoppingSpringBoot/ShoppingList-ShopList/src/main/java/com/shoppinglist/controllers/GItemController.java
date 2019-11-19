package com.shoppinglist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppinglist.model.GroceryItem;
import com.shoppinglist.repos.GItemRepo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/gitems")
public class GItemController {
	@Autowired
	private GItemRepo gir;

	public void setGir(GItemRepo gir) {
		this.gir = gir;
	}

	@PostMapping("/addItem")
	public void saveItem(@RequestBody GroceryItem gi) {
		gir.save(gi);
	}

	@GetMapping("/deleteItem/{id}")
	public String deleteItem(@PathVariable("id") int id) {
		gir.deleteById(id);
		return "deleted";
	}

	@GetMapping("/getAll")
	private void getAll() {

	}

}
