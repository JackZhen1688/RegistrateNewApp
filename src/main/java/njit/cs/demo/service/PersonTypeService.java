package njit.cs.demo.service;

import java.util.List;
import njit.cs.demo.domain.PersonType;


public interface PersonTypeService {
	
	public List<PersonType> getPersonTypes();

	public PersonType getPersonTypeById(Long id);

}
