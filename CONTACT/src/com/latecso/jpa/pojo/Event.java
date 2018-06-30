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
@Table(name = "event")

public class Event {

	private int event_id;
	private String event,event_label;
	private Contact contact;
	
	public Event(){
	}
	
	public Event(String event,String event_label){
		this.event=event;
		this.event_label=event_label;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "event_id")
	
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEvent_label() {
		return event_label;
	}
	public void setEvent_label(String event_label) {
		this.event_label = event_label;
	}

	@OneToOne
	@JoinColumn(name="CONTACT_CONTACT_ID5")

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
