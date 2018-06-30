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
@Table(name = "address")

public class Address {
	
	private int address_id;
	private String address,a_label;
	private Contact contact;
	
	public Address(){	
	}
	
    public Address(String address,String a_label){
		this.address=address;
		this.a_label=a_label;
	}

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id")
    
	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getA_label() {
		return a_label;
	}

	public void setA_label(String a_label) {
		this.a_label = a_label;
	}

	@OneToOne
	@JoinColumn(name="CONTACT_CONTACT_ID1")
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
