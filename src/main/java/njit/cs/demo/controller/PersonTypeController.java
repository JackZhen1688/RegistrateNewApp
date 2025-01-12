package njit.cs.demo.controller;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import njit.cs.demo.domain.PersonType;
import njit.cs.demo.service.PersonTypeService;



@RestController
@RequestMapping("/RegistrateNewApp")
@CrossOrigin(origins = "*")
public class PersonTypeController {

	private static final Logger log = LogManager.getLogger(PhoneTypeController.class);
	
	@Autowired
	private PersonTypeService personTypeService;
	
	@GetMapping(value = "/personTypes")
	public List<PersonType> getPhoneTypes() 
	{
		try {
			log.debug("Request to getPhoneTypes() from controller");
			
			return personTypeService.getPersonTypes();
		} catch (Exception e) {
			log.error("Error calling getPhoneTypes()()", e);
			return null;
		}
	}
	
	@GetMapping(value = "/personTypeById/{id}")
	public PersonType getPersonTypeById(@PathVariable("id") Long id) 
	{
		try {
			
			log.debug("Request to getPersonTypeById() from controller");
			
			return personTypeService.getPersonTypeById(id);
		} catch (Exception e) {
			log.error("Error calling getPersonTypeById()", e);
			return null;
		}
	}
	
}
