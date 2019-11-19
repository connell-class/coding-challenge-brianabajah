package com.shoppinglist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shoppinglist.repos.GListRepo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/glist")
public class GListController {

	private GListRepo glr;

	@Autowired
	public void setGlr(GListRepo glr) {
		this.glr = glr;
	}


}
