package com.upskilling.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientConfigurationWrapper {

	private List<ClientConfiguration> clientConfigurations;

	public List<ClientConfiguration> getClientConfigurations() {
		return clientConfigurations;
	}

	public void setClientConfigurations(List<ClientConfiguration> clientConfigurations) {
		this.clientConfigurations = clientConfigurations;
	}

	@Override
	public String toString() {
		return "ClientConfigurationWrapper [clientConfigurations=" + clientConfigurations + "]";
	}

}
