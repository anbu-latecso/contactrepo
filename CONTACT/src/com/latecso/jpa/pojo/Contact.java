package com.latecso.jpa.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.persistence.*;

@Entity
@Table(name = "contact")
@ManagedBean(name="contact")
@SessionScoped

public class Contact {
	
	private int contact_id;	
	private String name,phonetic_last,phonetic_first,nick_name,file_as,company,job_title,notes,birthday; 
	
	private List<Address> CONTACT_CONTACT_ID1;
	private List<Chat> CONTACT_CONTACT_ID2;
	private List<Custom_Field> CONTACT_CONTACT_ID3;
	private List<Email> CONTACT_CONTACT_ID4;
	private List<Event> CONTACT_CONTACT_ID5;
	private List<Internet_Call> CONTACT_CONTACT_ID6;
	private List<Phone> CONTACT_CONTACT_ID7;
	private List<Relationship> CONTACT_CONTACT_ID8;
	private List<Website> CONTACT_CONTACT_ID9;
	
	public Contact(String name,String phonetic_last,String phonetic_first,String nick_name,String file_as,String company,String job_title,String notes,String birthday){
		this.name=name;
		this.phonetic_last=phonetic_last;
		this.phonetic_first=phonetic_first;
		this.nick_name=nick_name;
		this.file_as=file_as;
		this.company=company;
		this.job_title=job_title;
		this.notes=notes;
		this.birthday=birthday;
	}

	public Contact() {	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contact_id")
	
	public int getContact_id() {
		return contact_id;
	}

	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonetic_last() {
		return phonetic_last;
	}

	public void setPhonetic_last(String phonetic_last) {
		this.phonetic_last = phonetic_last;
	}

	public String getPhonetic_first() {
		return phonetic_first;
	}

	public void setPhonetic_first(String phonetic_first) {
		this.phonetic_first = phonetic_first;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getFile_as() {
		return file_as;
	}

	public void setFile_as(String file_as) {
		this.file_as = file_as;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="contact")
	public List<Address> getCONTACT_CONTACT_ID1() {
		return CONTACT_CONTACT_ID1;
	}

	public void setCONTACT_CONTACT_ID1(List<Address> cONTACT_CONTACT_ID1) {
		CONTACT_CONTACT_ID1 = cONTACT_CONTACT_ID1;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="contact")
	

	public List<Chat> getCONTACT_CONTACT_ID2() {
		return CONTACT_CONTACT_ID2;
	}

	public void setCONTACT_CONTACT_ID2(List<Chat> cONTACT_CONTACT_ID2) {
		CONTACT_CONTACT_ID2 = cONTACT_CONTACT_ID2;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="contact")
	public List<Custom_Field> getCONTACT_CONTACT_ID3() {
		return CONTACT_CONTACT_ID3;
	}

	public void setCONTACT_CONTACT_ID3(List<Custom_Field> cONTACT_CONTACT_ID3) {
		CONTACT_CONTACT_ID3 = cONTACT_CONTACT_ID3;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="contact")
	public List<Email> getCONTACT_CONTACT_ID4() {
		return CONTACT_CONTACT_ID4;
	}

	public void setCONTACT_CONTACT_ID4(List<Email> cONTACT_CONTACT_ID4) {
		CONTACT_CONTACT_ID4 = cONTACT_CONTACT_ID4;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="contact")
	public List<Event> getCONTACT_CONTACT_ID5() {
		return CONTACT_CONTACT_ID5;
	}

	public void setCONTACT_CONTACT_ID5(List<Event> cONTACT_CONTACT_ID5) {
		CONTACT_CONTACT_ID5 = cONTACT_CONTACT_ID5;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="contact")
	public List<Internet_Call> getCONTACT_CONTACT_ID6() {
		return CONTACT_CONTACT_ID6;
	}

	public void setCONTACT_CONTACT_ID6(List<Internet_Call> cONTACT_CONTACT_ID6) {
		CONTACT_CONTACT_ID6 = cONTACT_CONTACT_ID6;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="contact")
	public List<Phone> getCONTACT_CONTACT_ID7() {
		return CONTACT_CONTACT_ID7;
	}

	public void setCONTACT_CONTACT_ID7(List<Phone> cONTACT_CONTACT_ID7) {
		CONTACT_CONTACT_ID7 = cONTACT_CONTACT_ID7;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="contact")
	public List<Relationship> getCONTACT_CONTACT_ID8() {
		return CONTACT_CONTACT_ID8;
	}

	public void setCONTACT_CONTACT_ID8(List<Relationship> cONTACT_CONTACT_ID8) {
		CONTACT_CONTACT_ID8 = cONTACT_CONTACT_ID8;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true,mappedBy="contact")
	public List<Website> getCONTACT_CONTACT_ID9() {
		return CONTACT_CONTACT_ID9;
	}

	public void setCONTACT_CONTACT_ID9(List<Website> cONTACT_CONTACT_ID9) {
		CONTACT_CONTACT_ID9 = cONTACT_CONTACT_ID9;
	}

    private List<Address> addrs = new ArrayList<Address>();
	private List<Email> email = new ArrayList<Email>();
	private List<Phone> phone = new ArrayList<Phone>();
	private List<Chat> chat = new ArrayList<Chat>();
	private List<Custom_Field> custom = new ArrayList<Custom_Field>();
	private List<Event> event = new ArrayList<Event>();
	private List<Internet_Call> net = new ArrayList<Internet_Call>();
	private List<Relationship> rel = new ArrayList<Relationship>();
	private List<Website> web = new ArrayList<Website>();

		
	// ADD and REMOVE BUTTON ACTIONS

	public List<Address> getAddrs() {
		return addrs;
	}

	public void setAddrs(List<Address> addrs) {
		this.addrs = addrs;
	}

	public void onButtonRemoveAddress(final Address address) {
		addrs.remove(address);
	}

	public void onButtonAddAddress(AjaxBehaviorEvent p_oEvent) {
		addrs.add(new Address());
	}

	// EMAIL ADD REMOVE

	public List<Email> getEmail() {
		return email;
	}

	public void setEmail(List<Email> email) {
		this.email = email;
	}

	public void onButtonRemoveEmail(final Email mail) {
		email.remove(mail);
	}

	public void onButtonAddEmail(AjaxBehaviorEvent p_oEvent) {
		email.add(new Email());
	}

	// PHONE ADD REMOVE
	
	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	public void onButtonRemovePhone(final Phone ph) {
		phone.remove(ph);
	}

	public void onButtonAddPhone(AjaxBehaviorEvent p_oEvent) {
		phone.add(new Phone());
	}

	// CHAT ADD REMOVE
	
	public List<Chat> getChat() {
		return chat;
	}

	public void setChat(List<Chat> chat) {
		this.chat = chat;
	}

	public void onButtonRemoveChat(final Chat ch) {
		chat.remove(ch);
	}

	public void onButtonAddChat(AjaxBehaviorEvent p_oEvent) {

		chat.add(new Chat());
	}

	// CUSTOM ADD REMOVE
	
	public List<Custom_Field> getCustom() {
		return custom;
	}

	public void setCustom(List<Custom_Field> custom) {
		this.custom = custom;
	}

	public void onButtonRemoveCustom(final Custom_Field cus) {
		custom.remove(cus);
	}

	public void onButtonAddCustom(AjaxBehaviorEvent p_oEvent) {
		custom.add(new Custom_Field());
	}

	// EVENT ADD REMOVE
	
	public List<Event> getEvent() {
		return event;
	}

	public void setEvent(List<Event> event) {
		this.event = event;
	}

	public void onButtonRemoveEvent(final Event ev) {
		event.remove(ev);
	}

	public void onButtonAddEvent(AjaxBehaviorEvent p_oEvent) {
		event.add(new Event());
	}

	// NET ADD REMOVE
	
	public List<Internet_Call> getNet() {
		return net;
	}

	public void setNet(List<Internet_Call> net) {
		this.net = net;
	}

	public void onButtonRemoveNet(final Internet_Call ne) {
		net.remove(ne);
	}

	public void onButtonAddNet(AjaxBehaviorEvent p_oEvent) {
		net.add(new Internet_Call());
	}

	// RELATION ADD REMOVE
	
	public List<Relationship> getRel() {
		return rel;
	}

	public void setRel(List<Relationship> rel) {
		this.rel = rel;
	}

	public void onButtonRemoveRelation(final Relationship re) {
		rel.remove(re);
	}

	public void onButtonAddRelation(AjaxBehaviorEvent p_oEvent) {
		rel.add(new Relationship());
	}

	// WEB ADD REMOVE
	
	public List<Website> getWeb() {
		return web;
	}

	public void setWeb(List<Website> web) {
		this.web = web;
	}

	public void onButtonRemoveWeb(final Website we) {
		web.remove(we);
	}

	public void onButtonAddWeb(AjaxBehaviorEvent p_oEvent) {
		web.add(new Website());
	}

}
