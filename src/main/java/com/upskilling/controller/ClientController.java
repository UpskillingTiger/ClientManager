package com.upskilling.controller;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

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
		List<ClientConfiguration> allClients = getAllClients().getClientModels();
		ClientConfigurationWrapper clientConfigurationWrapper = new ClientConfigurationWrapper();
		clientConfigurationWrapper.setClientModels(allClients);
		model.put("clientConfigurationWrapper", clientConfigurationWrapper);
		return "ManageClient";
	}

	@PostMapping("/manageClient")
	public String manageClient(@ModelAttribute ClientConfigurationWrapper clientConfigurationWrapper, ModelMap model) {
		System.out.println(clientConfigurationWrapper);
		model.put("status", "Client Managed Successfully");
		return "ClientManaged";

	}

	private ClientConfigurationWrapper getAllClients() {

		final String uri = "http://api:8080/api/client";

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();

		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<ClientConfigurationWrapper> respEntity = restTemplate.exchange(uri, HttpMethod.GET, entity,
				ClientConfigurationWrapper.class);
		System.out.println("respEntity Response is ..." + respEntity);
		ClientConfigurationWrapper body = respEntity.getBody();
		System.out.println("ClientConfigurationWrapper Response is ..." + body);
		return body;

	}

}