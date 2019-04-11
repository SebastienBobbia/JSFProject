package com.formation.business;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.formation.entity.Client;

@ManagedBean(name="facade")
@ApplicationScoped
public class ClientFacadeBean implements ClientFacade {
	
	private static List<Client> clients;
	private static int i=1;
 
	@Override
	public Client createClient(Client client) {
		client.setId(i++);
		clients.add(client);
		return client;
	}
 
	@Override
	public List<Client> findClients() {
		return clients;
	}
	
	@Override
	public void delete(Client client) {
		clients.remove(client);
	}
	
	@PostConstruct
	private void init(){
		clients=new ArrayList<Client>();
		
		clients.add(new Client(i++, "Didier", "Pelat"));
		clients.add(new Client(i++, "Laure", "Bourgois"));
		clients.add(new Client(i++, "Sylvain", "Henry"));
		clients.add(new Client(i++, "Jim", "Alec"));	
	}

	
}

