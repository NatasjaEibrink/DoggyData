package nl.eibrink.doggydata.repository;

import nl.eibrink.doggydata.model.Dog;
import nl.eibrink.doggydata.model.HealthTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HealthTestRepository extends CrudRepository<HealthTest, Integer> {

    List<HealthTest> findByDog(Dog dog);
}

