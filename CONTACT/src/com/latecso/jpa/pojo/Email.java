package com.latecso.jpa.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "email")

public class Email {
	
	private int email_id;
	private String email,email_label;
	private Contact contact;
	
	public Email(){
	}

	public Email(String email,String email_label){
		this.email=email;
		this.email_label=email_label;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "email_id")
	
	public int getEmail_id() {
		return email_id;
	}
	public void setEmail_id(int email_id) {
		this.email_id = email_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail_label() {
		return email_label;
	}
	public void setEmail_label(String email_label) {
		this.email_label = email_label;
	}

	@OneToOne
	@JoinColumn(name="CONTACT_CONTACT_ID4")

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}	

}
