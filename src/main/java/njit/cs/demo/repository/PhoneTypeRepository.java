package njit.cs.demo.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import njit.cs.demo.domain.PhoneType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface PhoneTypeRepository extends JpaRepository<PhoneType, Long>{

	//1. JPA Query: Default 
	public List<PhoneType> findAll();
	
	//2. JPA Query: Object
	//@Query(value = "SELECT pt FROM PhoneType pt")
	//public List<PhoneType> findAll();
	
	//3. Native Query
	//@Query(value = "SELECT \"PTY_ID\", \"PHONE_TYPE\" FROM public.\"PHONE_TYPE\"", nativeQuery = true )
	//public List<PhoneType> findAll();

}
