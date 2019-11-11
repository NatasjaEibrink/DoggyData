package nl.eibrink.doggydata.controllers;

import nl.eibrink.doggydata.model.Dog;
import nl.eibrink.doggydata.model.HealthTest;
import nl.eibrink.doggydata.model.RegisterHealthResultsRequest;
import nl.eibrink.doggydata.repository.DogRepository;
import nl.eibrink.doggydata.repository.HealthTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HealthTestResultsEndpoint {

    @Autowired
    HealthTestRepository healthTestRepository;

    @Autowired
    DogRepository dogRepository;

    @GetMapping("/gezondheidstesten/{id}")
    public List<HealthTest> getRegisteredHealthResults(@PathVariable Integer id){

        Optional<Dog> dog = dogRepository.findById(id);

        if(!dog.isPresent()){
            throw new NoSuchElementException();
        }

        List<HealthTest> healthTests = healthTestRepository.findByDog(dog.get());

        return healthTests;
    }

    @PostMapping("/gezondheidstesten/{id}")
    public void registerHealthResults(@PathVariable Integer id, @RequestBody RegisterHealthResultsRequest request){

        Optional<Dog> dog = dogRepository.findById(id);
        if(!dog.isPresent()){
            throw new NoSuchElementException();
        }

        HealthTest healthTest = new HealthTest(request.getPatella(), request.getHeupen(), request.getOgen(), request.getDateOfExamination(), dog.get());
        healthTestRepository.save(healthTest);
    }
}
