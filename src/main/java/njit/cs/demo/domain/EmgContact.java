package njit.cs.demo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;


@Entity
@Table(name = "\"EMGCONTACT\"", schema = "Public")
public class EmgContact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Sequence")
	@SequenceGenerator(name="id_Sequence", schema="Public", sequenceName="\"SEQ_EMGCONTACT\"", allocationSize=1)
	@Column(name="\"ECT_ID\"", unique=true, nullable=false)         
	private Long id;     

	@Column(name="\"CONTACT_NAME\"")
	private String contactName;
	
	@Column(name="\"CONTACT_RELATION\"")
	private String contactRelation;
	
	@Column(name="\"CONTACT_PHONE\"")
	private String contactPhone;
	
	@Column(name="\"CONTACT_EMAIL\"")
	private String contactEmail;
	
	@OneToOne
	@JoinColumn(name="\"PER_ID\"", nullable=false)
	@JsonBackReference
	private Person person;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactRelation() {
		return contactRelation;
	}

	public void setContactRelation(String contactRelation) {
		this.contactRelation = contactRelation;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}


	public String getContactEmail() {
		return contactEmail;
	}


	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


}
