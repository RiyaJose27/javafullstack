package com.caresoft.clinicapp;

public interface PHICompliantUser {
	boolean assignPin(int pin);
	boolean isAuthorized(Integer confirmedAuthID);
}