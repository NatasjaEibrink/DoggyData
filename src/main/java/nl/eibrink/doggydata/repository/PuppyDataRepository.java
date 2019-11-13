package nl.eibrink.doggydata.repository;

import nl.eibrink.doggydata.model.Dog;
import nl.eibrink.doggydata.model.PuppyData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PuppyDataRepository extends CrudRepository<PuppyData, Integer> {

    List<PuppyData> findByDog(Dog dog);
}
