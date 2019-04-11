package com.formation.business;

import java.util.List;

import com.formation.entity.Client;

public interface ClientFacade {
	
	public Client createClient (Client client);
	public List<Client> findClients();
	public void delete (Client client);

}
