package nl.eibrink.doggydata.repository;

import nl.eibrink.doggydata.model.Litter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LitterRepository extends CrudRepository<Litter, Integer> {
}

