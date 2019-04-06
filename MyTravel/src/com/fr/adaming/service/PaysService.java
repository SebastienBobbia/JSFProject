package com.fr.adaming.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.fr.adaming.Domain.Pays;

@ManagedBean(name="paysService", eager = true)
@ApplicationScoped
public class PaysService {

	
	private List<Pays> listPays;
    
    @PostConstruct
    public void init() {
    	listPays = new ArrayList<>();
		listPays.add(new Pays("France", "descripF"));
		listPays.add(new Pays("Tahiti", "descripT"));
		listPays.add(new Pays("Chine", "descripC"));
		listPays.add(new Pays("Autriche", "descripA"));
		listPays.add(new Pays("Espagne", "descripE"));
    }
     
	public List<Pays> getListPays() {
		return listPays;
	}

	public void setListPays(List<Pays> listPays) {
		this.listPays = listPays;
	}


    
    
    
}
