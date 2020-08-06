package com.upskilling.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientConfigurationWrapper {

	private List<ClientConfiguration> clientModels;

	public List<ClientConfiguration> getClientModels() {
		return clientModels;
	}

	public void setClientModels(List<ClientConfiguration> clientModels) {
		this.clientModels = clientModels;
	}

	@Override
	public String toString() {
		return "ClientConfigurationWrapper [clientModels=" + clientModels + "]";
	}

}
