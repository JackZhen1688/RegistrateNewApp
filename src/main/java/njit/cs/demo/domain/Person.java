package njit.cs.demo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;


@Entity
@Table(name = "\"PERSON\"", schema = "Public")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Sequence")
	@SequenceGenerator(name="id_Sequence", schema="Public", sequenceName="\"SEQ_PERSON\"", allocationSize=1)
	@Column(name="\"PER_ID\"", unique=true, nullable=false)         
	private Long id;                                   	    

	@Column(name="\"UID\"")
	private String userId;

	@Column(name="\"PWD\"")
	private String password;

	@Column(name="\"FIRST_NAME\"")
	private String firstName;

	@Column(name="\"LAST_NAME\"")
	private String lastName;

	@Column(name="\"SSN\"")
	private Long ssn;

	@Column(name="\"BIRTH_DAY\"")
	private Date birthDay;
	
    @Column(name = "\"PERT_ID\"")
    private Long pertId;
    
    /*-----------------------------------------------
     * Ignore when column is used by mapping
     * For new version of the Hibernate
     * Only mapping in the main table by the the keys
     *-----------------------------------------------*/
    //#1.Using foreign key
    //   Person(Foreign key:ADD_ID) --> Address(Primary key:ADD_ID)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "\"ADD_ID\"")
    private Address address;
    
    //#2.Using share primary key
    //   Person(Primary key:PER_ID) --> EmgContact(Foreign key:PER_ID)
    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
	private EmgContact emgContact;  
	
    //#2.Using share primary key
    //   Person(Primary key:PER_ID) --> Phone(Foreign key:PER_ID)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "\"PER_ID\"")
    private Set<Phones> phones = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Long getPertId() {
		return pertId;
	}

	public void setPertId(Long pertId) {
		this.pertId = pertId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
		
	public EmgContact getEmgContact() {
		return emgContact;
	}

	public void setEmgContact(EmgContact emgContact) {
		this.emgContact = emgContact;
	}
	
	public Set<Phones> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phones> phones) {
		this.phones = phones;
	}	


}
