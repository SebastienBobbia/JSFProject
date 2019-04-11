package com.fr.adaming.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserBean {
	
private String email;
private String userName;
private String userLastName;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	private Date date6;
	private List<Date> invalidDates;
	private List<Integer> invalidDays;
	private Date dateAller = Calendar.getInstance().getTime();
	

	@PostConstruct
	public void init() {
		invalidDates = new ArrayList<>();
		Date today = new Date();
		invalidDates.add(today);
		long oneDay = 24 * 60 * 60 * 1000;
		for (int i = 0; i < 5; i++) {
			invalidDates.add(new Date(invalidDates.get(i).getTime() + oneDay));
		}

		invalidDays = new ArrayList<>();
		invalidDays.add(0); /* the first day of week is disabled */
		invalidDays.add(6);

	}
	
	public Date getDate6() {
        return date6;
    }
 
    public void setDate6(Date date6) {
        this.date6 = date6;
    }
    
    public List<Date> getInvalidDates() {
        return invalidDates;
    }
 
    public void setInvalidDates(List<Date> invalidDates) {
        this.invalidDates = invalidDates;
    }
 
    public List<Integer> getInvalidDays() {
        return invalidDays;
    }
 
    public void setInvalidDays(List<Integer> invalidDays) {
        this.invalidDays = invalidDays;
    }

	public Date getDateAller() {
		return dateAller;
	}

	public void setDateAller(Date dateAller) {
		this.dateAller = dateAller;
	}
    
    public String todayDate() {
    	Date today = Calendar.getInstance().getTime();
    	String pattern = "dd/M/yy";
    	DateFormat df = new SimpleDateFormat(pattern);
    	today = Calendar.getInstance().getTime();        
    	String todayAsString = df.format(today);
    	return todayAsString;

    }
    
    public String dateAllerFormat() {
    	String pattern = "dd/M/yy";
    	DateFormat df = new SimpleDateFormat(pattern);        
    	String dateAllerS = df.format(dateAller);
    	return dateAllerS;
    }
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
    
    
}