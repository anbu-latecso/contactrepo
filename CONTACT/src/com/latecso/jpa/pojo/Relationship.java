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
@Table(name = "relationship")

public class Relationship {
	
	private int relation_id;
	private String relationship,r_label;
	private Contact contact;
	
	public Relationship(){
	}
	
	public Relationship(String relationship,String r_label){
		this.relationship=relationship;
		this.r_label=r_label;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "relation_id")
	
	public int getRelation_id() {
		return relation_id;
	}
	public void setRelation_id(int relation_id) {
		this.relation_id = relation_id;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getR_label() {
		return r_label;
	}
	public void setR_label(String r_label) {
		this.r_label = r_label;
	}

    @OneToOne
	@JoinColumn(name="CONTACT_CONTACT_ID8")
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
