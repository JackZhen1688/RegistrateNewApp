package njit.cs.demo.domain;

import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table(name = "\"PHONE_TYPE\"", schema = "Public")
public class PhoneType implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"PTY_ID\"")         
	private Long id;                                   	    
	                                                             
	@Column(name="\"PHONE_TYPE\"")
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	/*-----------------------------------
	 * Ignore it for now. Deal with later
	 *-----------------------------------*/
	//Foreign key link, no need this
	//@OneToOne(mappedBy = "phoneType")
    //private Phones phone;
	
}
