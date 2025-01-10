package njit.cs.demo.controller;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import njit.cs.demo.domain.Person;
import njit.cs.demo.service.PersonService;


@RestController
@RequestMapping("/RegistrateNewApp")
@CrossOrigin(origins = "*")
public class PersonController {

	private static final Logger log = LogManager.getLogger(PhoneTypeController.class);
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(value = "/personAll")
	public List<Person> findAll() 
	{
		try {
			log.debug("Request to personAll() from controller");
			
			return personService.findAll();
		} catch (Exception e) {
			log.error("Error calling personAll()()", e);
			return null;
		}
	}
	
	@GetMapping(value = "/personByUidandPwd/{uid}/{pwd}")
	public Person findByUserIdAndPassword(@PathVariable("uid") String uid, @PathVariable("pwd") String pwd) 
	{
		try {
			log.debug("Request to personAll() from controller");
			
			return personService.findByUserIdAndPassword(uid.toUpperCase(), pwd);
		
		} catch (Exception e) {
			log.error("Error calling findByUserIdAndPassword(()", e);
			return null;
		}
	}
	
	@GetMapping(value = "/personBySsn/{ssn}")
	public Person getPersonBySsn(@PathVariable("ssn") Long ssn) 
	{
		try {
			log.debug("Request togetPersonBySsn() from controller");
			
			return personService.getPersonBySsn(ssn);
		} catch (Exception e) {
			log.error("Error calling getPersonBySsn()", e);
			return null;
		}
	}	

	@PostMapping(value = "/postPerson")
    public Person postPerson(@RequestBody Person person) {
		
		try {
			 log.debug("Request postPerson from controller");
			 
			 return personService.savePerson(person);

		} catch (Exception e) {
		     log.error("Error calling postPerson()", e);
		     return null;
		}
	
    }
	

	@DeleteMapping(value = "/deletePerson/{id}")
    public void deletePerson(@PathVariable("id") String id) {
		
		try {
			 log.debug("Request deletePerson from controller");
			
			 Long perId = Long.parseLong(id);
		     personService.deletePerson(perId);
		     
		} catch (Exception e) {
		     log.error("Error calling deleePerson()", e);
		}
	
    }	

	
}
