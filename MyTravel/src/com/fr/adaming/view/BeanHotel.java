package com.fr.adaming.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import com.fr.adaming.Domain.Hotel;
import com.fr.adaming.service.HotelService;

@ManagedBean
@ViewScoped
public class BeanHotel implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public String nomPays;
	public Hotel selectedHotel;
	
	@ManagedProperty("#{hotelService}")
    public HotelService service;

	ArrayList<Hotel> listHotel = new ArrayList<Hotel>();
	
	@PostConstruct
	public void init() {
	
		listHotel = service.getListHotel();
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public Hotel getSelectedHotel() {
		return selectedHotel;
	}

	public void setSelectedHotel(Hotel selectedHotel) {
		this.selectedHotel = selectedHotel;
	}

	public ArrayList<Hotel> getListHotel() {
		return listHotel;
	}

	public void setListHotel(ArrayList<Hotel> listHotel) {
		this.listHotel = listHotel;
	}

	public void showHotel() {
		System.out.println("activé");

	}

	List<Hotel> viewHotel = new ArrayList<Hotel>();

	public List<Hotel> displayHotel() {
		for (Hotel hotel : listHotel) {
			if ((hotel.getPays()).equals(nomPays)) {
				viewHotel.add(hotel);
			}
		}
		return viewHotel;
	}

	public List<Hotel> getViewHotel() {
		return viewHotel;
	}

	public void setViewHotel(List<Hotel> viewHotel) {
		this.viewHotel = viewHotel;
	}

	public void activated() {
		System.out.println("reached");
	}

	public HotelService getService() {
		return service;
	}

	public void setService(HotelService service) {
		this.service = service;
	}
	

			
	
			
}
