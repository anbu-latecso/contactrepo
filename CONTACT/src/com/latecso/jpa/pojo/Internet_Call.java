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
@Table(name = "internet_call")

public class Internet_Call {
	
	private int internet_id;
	private String internet_call,ic_label;
	private Contact contact;
	
	public Internet_Call(){
	}
	
	public Internet_Call(String internet_call,String ic_label){
		this.internet_call=internet_call;
		this.ic_label=ic_label;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "internet_id")
	
	public int getInternet_id() {
		return internet_id;
	}
	public void setInternet_id(int internet_id) {
		this.internet_id = internet_id;
	}
	public String getInternet_call() {
		return internet_call;
	}
	public void setInternet_call(String internet_call) {
		this.internet_call = internet_call;
	}
	public String getIc_label() {
		return ic_label;
	}
	public void setIc_label(String ic_label) {
		this.ic_label = ic_label;
	}
	
    @OneToOne
	@JoinColumn(name="CONTACT_CONTACT_ID6")

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}
