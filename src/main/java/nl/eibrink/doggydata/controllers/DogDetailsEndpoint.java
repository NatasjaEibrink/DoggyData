package nl.eibrink.doggydata.controllers;

import nl.eibrink.doggydata.model.Dog;
import nl.eibrink.doggydata.model.ImageModel;
import nl.eibrink.doggydata.repository.DogRepository;
import nl.eibrink.doggydata.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DogDetailsEndpoint {

    @Autowired
    DogRepository dogRepository;

    @Autowired
    ImageRepository imageRepository;

    @GetMapping("/dogs/{id}")
    public Optional<Dog> getDogDetails(@PathVariable Integer id){
        return dogRepository.findById(id);
    }

    @PostMapping("/dogs/{id}/image")
    public ImageModel uploadImage(@PathVariable Integer id, @RequestParam("myFile") MultipartFile file) throws IOException {

        Optional<Dog> dog = dogRepository.findById(id);

        if(!dog.isPresent()){
            throw new NoSuchElementException();
        }

        ImageModel img = new ImageModel(file.getOriginalFilename(), file.getContentType(), file.getBytes(), dog.get());

        final ImageModel savedImage = imageRepository.save(img);

        return savedImage;
    }

    @GetMapping("dogs/{id}/image")
    public ImageModel retrieveUploadedImage(@PathVariable Integer id){
        Optional<Dog> dog = dogRepository.findById(id);

        if(!dog.isPresent()){
            throw new NoSuchElementException();
        }

        Integer dogId = dog.get().getId();
        Optional<ImageModel> image = imageRepository.findById(dogId);
        return image.orElse(null);

    }
}
