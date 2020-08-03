package com.upskilling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.upskilling.bean.Client;

@Controller
public class ClientController {

	@GetMapping({ "/home", "launchAddClient" })
	public String hello(ModelMap model) {
		model.put("client", new Client());
		return "AddClient";
	}

	@PostMapping("/addClient")
	public String addClient(@ModelAttribute Client client, ModelMap model) {
		System.out.println(client);
		return "AddClient";

	}

}