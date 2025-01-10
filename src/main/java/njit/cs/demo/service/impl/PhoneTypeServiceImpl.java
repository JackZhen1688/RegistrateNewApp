package njit.cs.demo.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import njit.cs.demo.domain.PhoneType;
import njit.cs.demo.repository.PhoneTypeRepository;
import njit.cs.demo.service.PhoneTypeService;


@Service
@Transactional
public class PhoneTypeServiceImpl implements PhoneTypeService {

	private static final Logger log = LogManager.getLogger(PhoneTypeServiceImpl.class);
	
	private final PhoneTypeRepository phoneTypeRepository;
	
	public PhoneTypeServiceImpl(PhoneTypeRepository phoneTypeRepository) {
		this.phoneTypeRepository = phoneTypeRepository;
	}
	
	@Override
	public List<PhoneType> getPhoneTypes() {
		
		log.debug("Request to getPhoneTypes() from service");
		List<PhoneType> phoneTypeList = phoneTypeRepository.findAll();
		
		return phoneTypeList;
	}

}
