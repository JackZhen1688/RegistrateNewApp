package njit.cs.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import jakarta.transaction.Transactional;
import njit.cs.demo.domain.Person;
import njit.cs.demo.repository.PersonRepository;
import njit.cs.demo.service.PersonService;


@Service
@Transactional
public class PersonServiceImpl implements PersonService {
	

	private static final Logger log = LogManager.getLogger(PersonServiceImpl.class);
	
	private final PersonRepository personRepository;
	
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public List<Person> findAll() {
		
		log.debug("Request to findAll() from service");
		List<Person> personList=  personRepository.findAll();
		
		return personList;
	}

	@Override
	public Person findByUserIdAndPassword(String uid, String pwd) {
		
		log.debug("Request to findByUserIdAndPassword() from service");
		Person person =  personRepository.findByUserIdAndPassword(uid, pwd);
		
		return person;
	}

	@Override
	public Person getPersonBySsn(Long ssn) {
		
		log.debug("Request to getPersonBySsn() from service");
		Person person=  personRepository.findBySsn(ssn);
		
		return person;
	}

	@Override
	public Person savePerson(Person person) {
		
		log.debug("Request to savePerson() from service");
		
		return personRepository.save(person);
	}	
	
	@Override
	public void deletePerson(Long id) {
		
		log.debug("Request to deletePerson() from service");
		
		personRepository.deleteById(id);
		//personRepository.delPersonById(id);
	}	
}
