package njit.cs.demo.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import njit.cs.demo.domain.PhoneType;
import njit.cs.demo.service.PhoneTypeService;


@RestController
@RequestMapping("/RegistrateNewApp")
@CrossOrigin(origins = "*")
public class PhoneTypeController {

	private static final Logger log = LogManager.getLogger(PhoneTypeController.class);
	
	@Autowired
	private PhoneTypeService phoneTypeService;

	
	@GetMapping(value = "/phoneTypes")
	public List<PhoneType> getPhoneTypes() 
	{
		try {
			log.debug("Request to getPhoneTypes() from controller");
			
			return phoneTypeService.getPhoneTypes();
			
		} catch (Exception e) {
			log.error("Error calling getPhoneTypes()()", e);
			return null;
		}
	}
	
	
	@GetMapping(value = "/test")
	public String getString() {
		
		return "Hello Junit Testing!";
	}
	
}
