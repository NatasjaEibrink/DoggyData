package nl.eibrink.doggydata.controllers;

import nl.eibrink.doggydata.model.Litter;
import nl.eibrink.doggydata.repository.LitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LitterRegistrationEndpoint {

    @Autowired
    private LitterRepository litterRepository;

    @GetMapping("/litters")
    public Iterable<Litter> getRegisteredLitters(){
        return litterRepository.findAll();
    }

    @PostMapping("/litters/add")
    public void registerLitter(@RequestBody Litter litter){
        litterRepository.save(litter);
    }
}
