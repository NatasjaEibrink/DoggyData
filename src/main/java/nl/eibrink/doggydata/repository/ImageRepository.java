package nl.eibrink.doggydata.repository;

import nl.eibrink.doggydata.model.ImageModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends CrudRepository<ImageModel, Integer> {

    List<ImageModel> findByDogId(Integer dogId);
}

