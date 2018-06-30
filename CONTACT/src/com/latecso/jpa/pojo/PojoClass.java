package com.latecso.jpa.pojo;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.latecso.jpa.db.DatabaseOperation;

@ManagedBean(name="user")

public class PojoClass {
	
	private String name,phonetic_last,phonetic_first,nick_name,file_as,company,job_title,notes,birthday;
	private String address,a_label;
	private String chat,c_label;
	private String custom_field,cf_label;
	private String email,email_label;
	private String event,event_label;
	private String internet_call,ic_label;
	private String phone;
	private String p_label;
	private String relationship,r_label;
	private String website,w_label;
	
	private String editId;
	
	int contact_id, CONTACT_CONTACT_ID1, CONTACT_CONTACT_ID2, CONTACT_CONTACT_ID3, CONTACT_CONTACT_ID4,
	CONTACT_CONTACT_ID5, CONTACT_CONTACT_ID6, CONTACT_CONTACT_ID7, CONTACT_CONTACT_ID8, CONTACT_CONTACT_ID9;
	
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
	public String getEditId() {
		return editId;
	}
	public void setEditId(String editId) {
		this.editId = editId;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public int getCONTACT_CONTACT_ID1() {
		return CONTACT_CONTACT_ID1;
	}
	public void setCONTACT_CONTACT_ID1(int cONTACT_CONTACT_ID1) {
		CONTACT_CONTACT_ID1 = cONTACT_CONTACT_ID1;
	}
	public int getCONTACT_CONTACT_ID2() {
		return CONTACT_CONTACT_ID2;
	}
	public void setCONTACT_CONTACT_ID2(int cONTACT_CONTACT_ID2) {
		CONTACT_CONTACT_ID2 = cONTACT_CONTACT_ID2;
	}
	public int getCONTACT_CONTACT_ID3() {
		return CONTACT_CONTACT_ID3;
	}
	public void setCONTACT_CONTACT_ID3(int cONTACT_CONTACT_ID3) {
		CONTACT_CONTACT_ID3 = cONTACT_CONTACT_ID3;
	}
	public int getCONTACT_CONTACT_ID4() {
		return CONTACT_CONTACT_ID4;
	}
	public void setCONTACT_CONTACT_ID4(int cONTACT_CONTACT_ID4) {
		CONTACT_CONTACT_ID4 = cONTACT_CONTACT_ID4;
	}
	public int getCONTACT_CONTACT_ID5() {
		return CONTACT_CONTACT_ID5;
	}
	public void setCONTACT_CONTACT_ID5(int cONTACT_CONTACT_ID5) {
		CONTACT_CONTACT_ID5 = cONTACT_CONTACT_ID5;
	}
	public int getCONTACT_CONTACT_ID6() {
		return CONTACT_CONTACT_ID6;
	}
	public void setCONTACT_CONTACT_ID6(int cONTACT_CONTACT_ID6) {
		CONTACT_CONTACT_ID6 = cONTACT_CONTACT_ID6;
	}
	public int getCONTACT_CONTACT_ID7() {
		return CONTACT_CONTACT_ID7;
	}
	public void setCONTACT_CONTACT_ID7(int cONTACT_CONTACT_ID7) {
		CONTACT_CONTACT_ID7 = cONTACT_CONTACT_ID7;
	}
	public int getCONTACT_CONTACT_ID8() {
		return CONTACT_CONTACT_ID8;
	}
	public void setCONTACT_CONTACT_ID8(int cONTACT_CONTACT_ID8) {
		CONTACT_CONTACT_ID8 = cONTACT_CONTACT_ID8;
	}
	public int getCONTACT_CONTACT_ID9() {
		return CONTACT_CONTACT_ID9;
	}
	public void setCONTACT_CONTACT_ID9(int cONTACT_CONTACT_ID9) {
		CONTACT_CONTACT_ID9 = cONTACT_CONTACT_ID9;
	}
	public String add(PojoClass mc) {
		return DatabaseOperation.create(mc.getName(),mc.getPhonetic_last(),mc.getPhonetic_first(),mc.getFile_as(),mc.getNick_name(),
				mc.getJob_title(),mc.getCompany(),mc.getBirthday(),mc.getNotes(),mc.getAddress(),mc.getA_label(),mc.getChat(),
				mc.getC_label(),mc.getCf_label(),mc.getCustom_field(),mc.getEmail(),mc.getEmail_label(),mc.getEvent(),mc.getEvent_label(),mc.getIc_label(),
				mc.getInternet_call(),mc.getP_label(),mc.getPhone(),mc.getR_label(),mc.getRelationship(),mc.getW_label(),mc.getWebsite());		
	}
	
	public List<Contact> list() {
		return DatabaseOperation.details();		
	}
	
	public String remove(int contact_id) {		
		return DatabaseOperation.delete(contact_id);		
	}
	
	public String editContacts() {
		editId=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("con");     
		 name = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("name");     
		 birthday = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("birth");
		 notes= FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("notes");
		 phonetic_last=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("p_last");
		 phonetic_first=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("p_first");
		 file_as=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("file");
		 company=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("company");
		 job_title=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("job");
		 nick_name=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nick");

		 address=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("addrs");
		a_label=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("al");
		
		
		chat=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("chat");
		c_label=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("chl");
		
		email=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("email");
		email_label=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("eml");

		custom_field=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("custom");
		cf_label=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("cul");
		
		phone=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("phone");
		p_label=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("pl");

		relationship=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("rel");
		r_label=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("rl");

		website=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("web");
		w_label=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("wl");

		internet_call=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("net");
		ic_label=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nl");
		
		event=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("event");
		event_label=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("el");

		 return "edit.xhtml";
	}

	public String updateContacts(PojoClass user) {
		return DatabaseOperation.updateContacts(Integer.parseInt(user.getEditId()),user.getName(),user.getNick_name(),user.getPhonetic_first(),user.getPhonetic_last(),user.getCompany(),user.getJob_title(),user.getNotes(),user.getFile_as(),user.getBirthday()/*,Integer.parseInt(user.getEditAddress()),user.getAddress(),user.getA_label(),user.getChat(),user.getC_label(),user.getEmail(),user.getEmail_label(),user.getPhone(),user.getP_label(),user.getCustom_field(),user.getCf_label(),user.getInternet_call(),user.getIc_label(),user.getWebsite(),user.getW_label(),user.getRelationship(),user.getR_label(),user.getEvent(),user.getEvent_label()*/);

	}

}
