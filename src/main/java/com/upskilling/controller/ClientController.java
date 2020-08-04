package com.upskilling.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.upskilling.bean.Client;
import com.upskilling.bean.ClientConfiguration;
import com.upskilling.bean.ClientConfigurationWrapper;

@Controller
public class ClientController {

	@GetMapping({ "/home", "launchAddClient" })
	public String home(ModelMap model) {
		Client value = new Client();
		model.put("client", value);
		return "AddClient";
	}

	@PostMapping("/addClient")
	public String addClient(@ModelAttribute Client client, ModelMap model) {
		System.out.println(client);
		model.put("status", "Client Added Successfully");
		return "ClientAdded";

	}

	@GetMapping({ "launchManageClient" })
	public String launchManageClient(ModelMap model) {
		List<ClientConfiguration> clientConfigurations = new ArrayList<ClientConfiguration>();
		for (int i = 0; i < 3; i++) {
			ClientConfiguration value = new ClientConfiguration();
			value.setId(i + "");
			value.setName("SEG");
			value.setStatus(true);
			clientConfigurations.add(value);
		}
		ClientConfigurationWrapper clientConfigurationWrapper = new ClientConfigurationWrapper();
		clientConfigurationWrapper.setClientConfigurations(clientConfigurations);
		model.put("clientConfigurationWrapper", clientConfigurationWrapper);
		return "ManageClient";
	}

	@PostMapping("/manageClient")
	public String manageClient(@ModelAttribute ClientConfigurationWrapper clientConfigurationWrapper, ModelMap model) {
		System.out.println(clientConfigurationWrapper);
		model.put("status", "Client Managed Successfully");
		return "ClientManaged";

	}

}