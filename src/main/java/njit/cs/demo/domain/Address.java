package njit.cs.demo.domain;


import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table(name = "\"ADDRESS\"", schema = "Public")
public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Sequence")
	@SequenceGenerator(name="id_Sequence", schema="Public", sequenceName="\"SEQ_ADDRESS\"", allocationSize=1)
	@Column(name="\"ADD_ID\"", unique=true, nullable=false)         
	private Long id;     

	@Column(name="\"STREET\"")
	private String street;

	@Column(name="\"CITY\"")
	private String city;
	
	@Column(name="\"STATE\"")
	private String state;
	
	@Column(name="\"ZIP\"")
	private Long zip;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZip() {
		return zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
