package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;
public class AdminUser extends User implements PHICompliantUser,PHIAdminCompliant {
	private String role;
    
    private Integer employeeID;

    private ArrayList<String> securityIncidents;
    
    public AdminUser() {}
    
    public AdminUser(Integer id, int pin, String role, Integer employeeID) {
    	super(id, pin);
    	this.setRole(role);
    	this.employeeID = employeeID;
    }
    // PHICompliantUser methods
	@Override
	public boolean assignPin(int pin) {	
		if(pin > 999999 || pin < 100000) {
			return false;
		}
		return true;
	}
	
	@Override
	public boolean isAuthorized(Integer confirmedAuthID) {
		authIncident();
		if( confirmedAuthID == this.getId()) {
			return true;
		} else {
			return false;			
		}
	}
    // PHIAdminCompliant method
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return securityIncidents;
	}
   
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.getId(), notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.getId(), "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    //getters and setters
    public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}