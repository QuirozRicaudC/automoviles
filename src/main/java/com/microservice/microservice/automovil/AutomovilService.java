package com.microservice.microservice.automovil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutomovilService {
    @Autowired private AutomovilRepository repo;

    public List<Automovil>listAll() {
        return (List<Automovil>) repo.findAll();
    }

    public void save(Automovil automovil){
        repo.save(automovil);
    }

    public Optional<Automovil> get(Integer id){
        return repo.findById(id);
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }
}
