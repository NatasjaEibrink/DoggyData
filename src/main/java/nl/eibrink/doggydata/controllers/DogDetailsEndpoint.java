package nl.eibrink.doggydata.controllers;

import nl.eibrink.doggydata.model.Dog;
import nl.eibrink.doggydata.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DogDetailsEndpoint {

    @Autowired
    DogRepository dogRepository;

    @GetMapping("/dogs/{id}")
    public Optional<Dog> getDogDetails(@PathVariable Integer id){
        return dogRepository.findById(id);
    }
}
