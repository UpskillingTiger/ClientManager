package com.upskilling.controller;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.upskilling.bean.Client;
import com.upskilling.bean.ClientsWrapper;

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
		HttpStatus addClient = addClient(client);
		model.put("status",
				addClient.is2xxSuccessful() ? "Client Added Successfully" : "Client Not Added, Please Try Again !!!");
		return "ClientAdded";

	}

	@GetMapping({ "launchManageClient" })
	public String launchManageClient(ModelMap model) {
		List<Client> allClients = getAllClients().getClients();
		ClientsWrapper clientsWrapper = new ClientsWrapper();
		clientsWrapper.setClients(allClients);
		model.put("clientsWrapper", clientsWrapper);
		return "ManageClient";
	}

	@PostMapping("/manageClient")
	public String manageClient(@ModelAttribute ClientsWrapper clientsWrapper, ModelMap model) {
		System.out.println(clientsWrapper);
		HttpStatus manageClient = manageClient(clientsWrapper);
		model.put("status", manageClient.is2xxSuccessful() ? "Client Managed Successfully"
				: "Client Not Modified, Please Try Again !!!");
		return "ClientManaged";

	}

	private ClientsWrapper getAllClients() {

		final String uri = "http://api:8080/api/client";

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<ClientsWrapper> respEntity = restTemplate.exchange(uri, HttpMethod.GET, entity,
				ClientsWrapper.class);
		ClientsWrapper body = respEntity.getBody();
		System.out.println("ClientConfigurationWrapper Response is ..." + body);
		return body;

	}

	private HttpStatus addClient(Client client) {

		final String uri = "http://api:8080/api/client";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> respEntity = restTemplate.postForEntity(uri, client, String.class);
		HttpStatus body = respEntity.getStatusCode();
		System.out.println("addClient Response is ..." + body);
		return body;

	}

	private HttpStatus manageClient(ClientsWrapper clientsWrapper) {

		final String uri = "http://api:8080/api/client";

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<ClientsWrapper> entity = new HttpEntity<ClientsWrapper>(clientsWrapper, headers);

		ResponseEntity<String> respEntity = restTemplate.exchange(uri, HttpMethod.PUT, entity, String.class);
		HttpStatus body = respEntity.getStatusCode();
		System.out.println("ClientConfigurationWrapper Response is ..." + body);
		return body;

	}

}