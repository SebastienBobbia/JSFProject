package com.formation.service;

import java.util.*;

import com.formation.domain.Pays;

public class PaysServiceImpl  implements PaysService {
	public Map<String, Pays> pays;
	
	public PaysServiceImpl() {
		pays = new HashMap<String, Pays>();		
			addPays(new Pays("France"));
			addPays(new Pays("Polynésie française"));
			addPays(new Pays("Chine"));
			addPays(new Pays("Autriche"));
			addPays(new Pays("Espagne"));
		
	}
	public Map<String, Pays> getPays() {
		return pays;
	}
	
	public void setPays(Map<String, Pays> pays) {
		this.pays = pays;
	}
	private void addPays(Pays pays) {
		pays.put(pays.getNomPays(), pays, null);
	}

	

	
	
	
}
