package njit.cs.demo.domain;

import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table(name = "\"PERSON_TYPE\"", schema = "Public")
public class PersonType implements Serializable {
	 
		private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Sequence")
		@SequenceGenerator(name="id_Sequence", schema="Public", sequenceName="\"SEQ_PERTYPE\"", allocationSize=1)
		@Column(name="\"PERT_ID\"", unique=true, nullable=false)         
		private Long id;                                   	    
		                                                             
		@Column(name="\"PERSON_TYPE\"")
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


}
