package nl.eibrink.doggydata.repository;

import nl.eibrink.doggydata.model.PuppyData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuppyDataRepository extends CrudRepository<PuppyData, Integer> {
}
