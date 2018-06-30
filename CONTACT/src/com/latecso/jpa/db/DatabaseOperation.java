package com.latecso.jpa.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.latecso.jpa.pojo.Address;
import com.latecso.jpa.pojo.Chat;
import com.latecso.jpa.pojo.Contact;
import com.latecso.jpa.pojo.Custom_Field;
import com.latecso.jpa.pojo.Email;
import com.latecso.jpa.pojo.Event;
import com.latecso.jpa.pojo.Internet_Call;
import com.latecso.jpa.pojo.Phone;
import com.latecso.jpa.pojo.Relationship;
import com.latecso.jpa.pojo.Website;


public class DatabaseOperation {
	
	private static EntityManager em = Persistence.createEntityManagerFactory("CONTACT").createEntityManager();
	private static EntityTransaction transaction = em.getTransaction();

	@SuppressWarnings("unchecked")
	public static List<Contact> details() {
		List<Contact> contact = em.createQuery("select c from Contact c ").getResultList();
		//List<Contact> contact = em.createQuery("select c.contact_id,c.name,c.company,c.job_title,e.email,p.phone from contact c INNER JOIN email e ON c.contact_id=e.CONTACT_CONTACT_ID4 INNER JOIN phone p ON c.contact_id=p.CONTACT_CONTACT_ID7;").getResultList();
		return contact;
	}

	public static String create(String name, String phonetic_last, String phonetic_first, String file_as,
			String nick_name, String job_title, String company, String birthday, String notes, String address,
			String a_label, String chat, String c_label, String cf_label, String custom_field, String email,
			String email_label, String event, String event_label, String ic_label, String internet_call, String p_label,
			String phone, String r_label, String relationship, String w_label, String website) {
		
		if(!transaction.isActive()) {
			transaction.begin();
		}
		
		List<Address> address1=new ArrayList<>();
		List<Chat> chat1=new ArrayList<>();
		List<Custom_Field> custom1=new ArrayList<>();
		List<Email> email1=new ArrayList<>();
		List<Event> event1=new ArrayList<>();
		List<Internet_Call> internet1=new ArrayList<>();
		List<Phone> phone1=new ArrayList<>();
		List<Relationship> relation1=new ArrayList<>();
		List<Website> website1=new ArrayList<>();
		
		Address a=new Address();
		a.setAddress_id(getMaxAID());
		a.setAddress(address);
		a.setA_label(a_label);
		em.persist(a);
		
		Chat ch=new Chat();
		ch.setChat_id(getMaxCID());
		ch.setChat(chat);
		ch.setC_label(c_label);
		em.persist(ch);
		
		Custom_Field cf=new Custom_Field();
		cf.setCustom_id(getMaxCFID());
		cf.setCustom_field(custom_field);
		cf.setCf_label(cf_label);
		em.persist(cf);
		
		Email e=new Email();
		e.setEmail_id(getMaxEID());
		e.setEmail(email);
		e.setEmail_label(email_label);
		em.persist(e);
		
		Event ev=new Event();
		ev.setEvent_id(getMaxEVID());
		ev.setEvent(event);
		ev.setEvent_label(event_label);
		em.persist(ev);
		
		Internet_Call ic=new Internet_Call();
		ic.setInternet_id(getMaxICID());
		ic.setInternet_call(internet_call);
		ic.setIc_label(ic_label);
		em.persist(ic);
		
		Phone ph=new Phone();
		ph.setPhone_id(getMaxPHID());
		ph.setPhone(phone);
		ph.setP_label(p_label);
		em.persist(ph);
		
		Relationship rs=new Relationship();
		rs.setRelation_id(getMaxRSID());
		rs.setRelationship(relationship);
		rs.setR_label(r_label);
		em.persist(rs);
		
		Website ws=new Website();
		ws.setWeb_id(getMaxWSID());
		ws.setWebsite(website);
		ws.setW_label(w_label);
		em.persist(ws); 
		
		Contact c=new Contact();
		c.setContact_id(getMaxID());
		c.setName(name);
		c.setPhonetic_first(phonetic_first);
		c.setPhonetic_last(phonetic_last);
		c.setNotes(notes);
		c.setFile_as(file_as);
		c.setBirthday(birthday);
		c.setNick_name(nick_name);
		c.setCompany(company);
		c.setJob_title(job_title);
		
		a.setContact(c);
		address1.add(a);
		c.setCONTACT_CONTACT_ID1(address1);
		
		ch.setContact(c);
		chat1.add(ch);
		c.setCONTACT_CONTACT_ID2(chat1);
		
		cf.setContact(c);
		custom1.add(cf);
		c.setCONTACT_CONTACT_ID3(custom1);
		
		e.setContact(c);
		email1.add(e);
		c.setCONTACT_CONTACT_ID4(email1);
		
		ev.setContact(c);
		event1.add(ev);
		c.setCONTACT_CONTACT_ID5(event1);
		
		ic.setContact(c);
		internet1.add(ic);
		c.setCONTACT_CONTACT_ID6(internet1);
		
		ph.setContact(c);
		phone1.add(ph);
		c.setCONTACT_CONTACT_ID7(phone1);
		
		rs.setContact(c);
		relation1.add(rs);
		c.setCONTACT_CONTACT_ID8(relation1);
		
		ws.setContact(c);	
		website1.add(ws);
		c.setCONTACT_CONTACT_ID9(website1);
		
		em.persist(c);
	    transaction.commit();
		System.out.println("insert");
		return null;
	}

	private static int getMaxWSID() {
		int maxId = 1;
		Query query = em.createQuery("SELECT MAX(ws.web_id)+1 FROM Website ws");
		if(query.getSingleResult() != null) {
			maxId = (Integer) query.getSingleResult();
		}
		return maxId;
	}

	private static int getMaxRSID() {
		int maxId = 1;
		Query query = em.createQuery("SELECT MAX(rs.relation_id)+1 FROM Relationship rs");
		if(query.getSingleResult() != null) {
			maxId = (Integer) query.getSingleResult();
		}
		return maxId;
	}

	private static int getMaxPHID() {
		int maxId = 1;
		Query query = em.createQuery("SELECT MAX(p.phone_id)+1 FROM Phone p");
		if(query.getSingleResult() != null) {
			maxId = (Integer) query.getSingleResult();
		}
		return maxId;
	}

	private static int getMaxICID() {
		int maxId = 1;
		Query query = em.createQuery("SELECT MAX(ic.internet_id)+1 FROM Internet_Call ic");
		if(query.getSingleResult() != null) {
			maxId = (Integer) query.getSingleResult();
		}
		return maxId;
	}

	private static int getMaxEVID() {
		int maxId = 1;
		Query query = em.createQuery("SELECT MAX(ev.event_id)+1 FROM Event ev");
		if(query.getSingleResult() != null) {
			maxId = (Integer) query.getSingleResult();
		}
		return maxId;
	}

	private static int getMaxEID() {
		int maxId = 1;
		Query query = em.createQuery("SELECT MAX(e.email_id)+1 FROM Email e");
		if(query.getSingleResult() != null) {
			maxId = (Integer) query.getSingleResult();
		}
		return maxId;
	}

	private static int getMaxCFID() {
		int maxId = 1;
		Query query = em.createQuery("SELECT MAX(cf.custom_id)+1 FROM Custom_Field cf");
		if(query.getSingleResult() != null) {
			maxId = (Integer) query.getSingleResult();
		}
		return maxId;
	}

	private static int getMaxCID() {
		int maxId = 1;
		Query query = em.createQuery("SELECT MAX(ch.chat_id)+1 FROM Chat ch");
		if(query.getSingleResult() != null) {
			maxId = (Integer) query.getSingleResult();
		}
		return maxId;
	}

	private static int getMaxID() {
		int maxId = 1;
		Query query = em.createQuery("SELECT MAX(c.contact_id)+1 FROM Contact c");
		if(query.getSingleResult() != null) {
			maxId = (Integer) query.getSingleResult();
		}
		return maxId;
	}
	private static int getMaxAID() {
		int maxId = 1;
		Query query = em.createQuery("SELECT MAX(a.address_id)+1 FROM Address a");
		if(query.getSingleResult() != null) {
			maxId = (Integer) query.getSingleResult();
		}
		return maxId;
	}

	public static String delete(int contact_id) {
			if (!transaction.isActive()) {
				transaction.begin();
			}

			Contact deleteObj = new Contact();
			if(isIdPresent(contact_id)) {
				deleteObj.setContact_id(contact_id);
				em.remove(em.merge(deleteObj));
			}		
			transaction.commit();
			return "list.xhtml?faces-redirect=true";
		}

		private static boolean isIdPresent(int contact_id) {
			boolean idResult = false;
			Query query = em.createQuery("SELECT c FROM Contact c WHERE c.contact_id = :contact_id");
			query.setParameter("contact_id", contact_id);
			Contact selectedId = (Contact) query.getSingleResult();
			if(selectedId != null) {
				idResult = true;
			}
			return idResult;
		}

		public static String updateContacts(int contact_id, String name, String nick_name, String phonetic_first,
				String phonetic_last, String company, String job_title, String notes, String file_as, String birthday) {
			if (!transaction.isActive()) {
				transaction.begin();
			}

			Query q = em.createQuery(
					"UPDATE Contact c SET c.name=:name, c.phonetic_last=:phonetic_last, c.phonetic_first=:phonetic_first, c.nick_name=:nick_name, c.file_as=:file_as,  c.company=:company,  c.job_title=:job_title,  c.birthday=:birthday, c.notes=:notes WHERE c.contact_id = :contact_id");

			q.setParameter("contact_id", contact_id);
			q.setParameter("phonetic_first", phonetic_first);
			q.setParameter("phonetic_last", phonetic_last);
			q.setParameter("name", name);
			q.setParameter("birthday", birthday);
			q.setParameter("file_as", file_as);
			q.setParameter("notes", notes);
			q.setParameter("job_title", job_title);
			q.setParameter("company", company);
			q.setParameter("nick_name", nick_name);
					
					
					/*Query ad = em.createQuery(
							"UPDATE Address c SET c.address=:address, c.a_label=:a_label, WHERE c.CONTACT_CONTACT_ID1= :CONTACT_CONTACT_ID1");
					ad.setParameter("address", address);
					ad.setParameter("a_label", a_label);

					ad.executeUpdate();

					Query ch = em.createQuery(
							"UPDATE Chat c SET c.chat=:chat, c.c_label=:c_label, WHERE c.CONTACT_CONTACT_ID2= :CONTACT_CONTACT_ID2");
					ch.setParameter("chat", chat);
					ch.setParameter("a_label", a_label);
					ch.executeUpdate();

					Query cus = em.createQuery(
							"UPDATE Custom_Field c SET c.custom_field=:custom_field, c.cf_label=:cf_label, WHERE c.CONTACT_CONTACT_ID3= :CONTACT_CONTACT_ID3");
					cus.setParameter("custom_field", custom_field);
					cus.setParameter("cf_label", cf_label);
					cus.executeUpdate();

					Query ema = em.createQuery(
							"UPDATE Email c SET c.email=:email, c.email_label=:email_label, WHERE c.CONTACT_CONTACT_ID4= :CONTACT_CONTACT_ID4");
					ema.setParameter("email", email);
					ema.setParameter("email_label", email_label);
					ema.executeUpdate();

					Query ev = em.createQuery(
							"UPDATE Event c SET c.event=:event, c.event_label=:event_label, WHERE c.CONTACT_CONTACT_ID5= :CONTACT_CONTACT_ID5");
					ev.setParameter("event", event);
					ev.setParameter("event_label", event_label);
					ev.executeUpdate();

					Query net = em.createQuery(
							"UPDATE Internet_call c SET c.internet_call=:internet_call, c.ic_label=:ic_label, WHERE c.CONTACT_CONTACT_ID6= :CONTACT_CONTACT_ID6");
					net.setParameter("internet_call", internet_call);
					net.setParameter("ic_label", ic_label);
					net.executeUpdate();

					Query ph = em.createQuery(
							"UPDATE Phone c SET c.phone=:phone, c.p_label=:p_label, WHERE c.CONTACT_CONTACT_ID7= :CONTACT_CONTACT_ID7");
					ph.setParameter("phone", phone);
					ph.setParameter("p_label", p_label);
					ph.executeUpdate();

					Query rel = em.createQuery(
							"UPDATE Relationship c SET c.relationship=:relationship, c.r_label=:r_label, WHERE c.CONTACT_CONTACT_ID8= :CONTACT_CONTACT_ID8");
					rel.setParameter("relationship", relationship);
					rel.setParameter("r_label", r_label);
					rel.executeUpdate();

					Query web = em.createQuery(
							"UPDATE Website c SET c.website=:website, c.w_label=:w_label, WHERE c.CONTACT_CONTACT_ID9= :CONTACT_CONTACT_ID9");
					web.setParameter("website", website);
					web.setParameter("w_label", w_label);
					web.executeUpdate();*/

					int update=q.executeUpdate();
					if(update>0){
						System.out.println("Update..."+contact_id+"...is Success");
						transaction.commit();
					}
			 return "list.xhtml";
		
		}
	

}
