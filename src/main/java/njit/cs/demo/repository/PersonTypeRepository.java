package njit.cs.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import njit.cs.demo.domain.PersonType;


@Repository
public interface PersonTypeRepository extends JpaRepository<PersonType, Long>{

	public List<PersonType> findAll();
	
	public PersonType findByType(String type);

}
