package nl.eibrink.doggydata.controllers;

import nl.eibrink.doggydata.model.Dog;
import nl.eibrink.doggydata.model.PuppyData;
import nl.eibrink.doggydata.model.registrationObjects.RegisterPuppyDataRequest;
import nl.eibrink.doggydata.repository.DogRepository;
import nl.eibrink.doggydata.repository.PuppyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PuppyDataEndpoint {

    @Autowired
    DogRepository dogRepository;

    @Autowired
    PuppyDataRepository puppyDataRepository;

    @PostMapping("/puppygroei/register/{id}")
    public void registerHealthResults(@PathVariable Integer id, @RequestBody RegisterPuppyDataRequest request){

        Optional<Dog> dog = dogRepository.findById(id);
        if(!dog.isPresent()){
            throw new NoSuchElementException();
        }

        PuppyData puppyData = new PuppyData(request.getWeekNumber(), request.getWeight(), dog.get());
        puppyDataRepository.save(puppyData);
    }
}
