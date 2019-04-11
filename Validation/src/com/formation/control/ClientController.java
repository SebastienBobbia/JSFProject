package com.formation.control;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.formation.business.ClientFacade;
import com.formation.entity.Client;

@ManagedBean
@RequestScoped
public class ClientController {
 
	@ManagedProperty(value = "#{facade}")
	private ClientFacade clientFacade;
 
	private Client client = new Client();
	
	public String saveAction() {
		 
		//get all existing value but set "editable" to false 
		for (Client cli : clientFacade.findClients()){
			cli.setEditable(false);
		}
		//return to current page
		return null;
 
	}
	
	public String editClient(Client client) {
		 
		client.setEditable(true);
		return null;
	}
	
	public String createClient() {
		clientFacade.createClient(client);
        return null;
    }
 
	public Client getClient() {
		return client;
	}
 
	public void setClient(Client client) {
		this.client = client;
	}
 
	public List<Client> getClientList() {
		return clientFacade.findClients();
	}
 
	public void setClientFacade(ClientFacade clientFacade) {
		this.clientFacade = clientFacade;
	}
 
}
