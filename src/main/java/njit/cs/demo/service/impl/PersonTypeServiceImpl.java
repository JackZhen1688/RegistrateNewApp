package njit.cs.demo.service.impl;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import njit.cs.demo.domain.PersonType;
import njit.cs.demo.repository.PersonTypeRepository;
import njit.cs.demo.service.PersonTypeService;


@Service
@Transactional
public class PersonTypeServiceImpl implements PersonTypeService {

	private static final Logger log = LogManager.getLogger(PersonTypeServiceImpl.class);
	
	private final PersonTypeRepository personTypeRepository;
	
	public PersonTypeServiceImpl(PersonTypeRepository personTypeRepository) {
		this.personTypeRepository = personTypeRepository;
	}
	
	@Override
	public List<PersonType> getPersonTypes() {
		
		log.debug("Request to getPersonTypes() from service");
		List<PersonType> personTypeList = personTypeRepository.findAll();
		
		return personTypeList;
	}
	
	@Override
	public PersonType getPersonTypeById(Long id) {
		
		log.debug("Request to getPersonTypeById() from service");
		Optional<PersonType> personTypeOpt = personTypeRepository.findById(id);
				 
		PersonType personType = personTypeOpt.orElse(new PersonType());
		
		return personType;
	}	
}
