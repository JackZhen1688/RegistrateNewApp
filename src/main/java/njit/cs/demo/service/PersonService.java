package njit.cs.demo.service;

import java.util.List;
import njit.cs.demo.domain.Person;


public interface PersonService {

	public List<Person> findAll();
	
	public Person findByUserIdAndPassword(String uid, String pwd);
	
	public Person getPersonBySsn(Long ssn);
	
	public Person savePerson(Person person);
	
	public void deletePerson(Long id);

}
