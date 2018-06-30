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
@Table(name = "custom_field")

public class Custom_Field {
	
	private int custom_id;
	private String custom_field,cf_label;
	private Contact contact;
	
	public Custom_Field(){
	}

	public Custom_Field(String custom_field,String cf_label){
		this.custom_field=custom_field;
		this.cf_label=cf_label;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "custom_id")
	
	public int getCustom_id() {
		return custom_id;
	}

	public void setCustom_id(int custom_id) {
		this.custom_id = custom_id;
	}

	public String getCustom_field() {
		return custom_field;
	}

	public void setCustom_field(String custom_field) {
		this.custom_field = custom_field;
	}

	public String getCf_label() {
		return cf_label;
	}

	public void setCf_label(String cf_label) {
		this.cf_label = cf_label;
	}

	@OneToOne
	@JoinColumn(name="CONTACT_CONTACT_ID3")

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
