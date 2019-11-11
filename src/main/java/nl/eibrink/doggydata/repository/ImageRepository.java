package nl.eibrink.doggydata.repository;

import nl.eibrink.doggydata.model.ImageModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends CrudRepository<ImageModel, Integer> {
}
