package njit.cs.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import njit.cs.demo.domain.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

	//#1. JPA Query
	public List<Person> findAll();

	//public Optional<Person> findById(Long id);
	
	public Person findByUserIdAndPassword(String uid, String pwd);

	//#2.1. JPA Query Object
	@Query("SELECT d FROM Person d Where d.ssn = ?1")
	public Person findBySsn(Long ssn);
	
	//#2.2. JPA Query Object
	//@Query(value = "SELECT \"UID\",\"PERT_ID\",\"PER_ID\", \"ADD_ID\",\"BIRTH_DAY\",\"SSN\",\"FIRST_NAME\",\"LAST_NAME\",\"PWD\" " +
	//		         "FROM public.\"PERSON\" d Where d.\"SSN\" =:ssn", nativeQuery = true)
	//public Person findBySsn(Long ssn);
	
	@Modifying
	@Query("DELETE FROM Person p Where p.id = :id")
	void delPersonById(Long id);

}
