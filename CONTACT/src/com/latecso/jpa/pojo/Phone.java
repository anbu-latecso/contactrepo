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
@Table(name = "phone")

public class Phone {
	
	private int phone_id;
	private String phone,p_label;
	private Contact contact;
	
	public Phone(){
	}
	
	public Phone(String phone,String p_label){
		this.phone=phone;
		this.p_label=p_label;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "phone_id")
	
	public int getPhone_id() {
		return phone_id;
	}
	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getP_label() {
		return p_label;
	}
	public void setP_label(String p_label) {
		this.p_label = p_label;
	}

    @OneToOne
	@JoinColumn(name="CONTACT_CONTACT_ID7")

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
