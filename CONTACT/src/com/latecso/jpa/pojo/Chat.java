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
@Table(name = "chat")

public class Chat {
	
	private int chat_id;
	private String chat,c_label;
	private Contact contact;
	
	public Chat(){
	}
	
	public Chat(String chat,String c_label){
		this.chat=chat;
		this.c_label=c_label;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "chat_id")
	
	public int getChat_id() {
		return chat_id;
	}

	public void setChat_id(int chat_id) {
		this.chat_id = chat_id;
	}

	public String getChat() {
		return chat;
	}

	public void setChat(String chat) {
		this.chat = chat;
	}

	public String getC_label() {
		return c_label;
	}

	public void setC_label(String c_label) {
		this.c_label = c_label;
	}
	
    @OneToOne
	@JoinColumn(name="CONTACT_CONTACT_ID2")
    
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}	       

}
