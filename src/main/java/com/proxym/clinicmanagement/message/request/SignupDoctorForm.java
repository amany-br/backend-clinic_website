package com.proxym.clinicmanagement.message.request;

import java.util.Set;

public class SignupDoctorForm {

    private String name;


    private String username;
    private String address;
    
    
    


    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String email;

    private Set<String> role;


    private String password; 


    private long category_id;

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}





