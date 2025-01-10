package njit.cs.demo.domain;

import java.io.Serializable;

import jakarta.persistence.*;


@Entity
@Table(name = "\"PHONES\"", schema = "Public")
public class Phones implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Sequence")
	@SequenceGenerator(name="id_Sequence", schema="Public", sequenceName="\"SEQ_PHONES\"", allocationSize=1)
	@Column(name="\"PH_ID\"", unique=true, nullable=false)         
	private Long id;                                   	    
	
    @Column(name="\"PHONE\"")
	private String phone;
	
    @Column(name="\"PH_TYPE\"")
	private String phoneType;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

    /*================================================
     * There is a difficulty implement from Angular UI
     * Ignore it for now. We deal with later
     *================================================*/
    //@Column(name = "\"PTY_ID\"")
    //private Long ptyId;
   
    //(Foreign key: PTY_ID)
    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "\"PTY_ID\"")
    //private PhoneType phoneType;
    //=================================================
    
}
