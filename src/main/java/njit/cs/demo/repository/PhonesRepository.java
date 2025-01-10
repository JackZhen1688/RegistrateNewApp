package njit.cs.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import njit.cs.demo.domain.Phones;


@Repository
public interface PhonesRepository extends JpaRepository<Phones, Long> {

}
