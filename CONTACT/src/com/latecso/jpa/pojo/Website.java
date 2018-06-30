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
@Table(name = "website")

public class Website {
	
	private int web_id;
	private String website,w_label;
	private Contact contact;
	
	public Website(){
	}
	
	public Website(String website,String w_label){
		this.website=website;
		this.w_label=w_label;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "web_id")
	
	public int getWeb_id() {
		return web_id;
	}
	public void setWeb_id(int web_id) {
		this.web_id = web_id;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getW_label() {
		return w_label;
	}
	public void setW_label(String w_label) {
		this.w_label = w_label;
	}

    @OneToOne
	@JoinColumn(name="CONTACT_CONTACT_ID9")

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}	

}
