package com.example.Service;

import org.springframework.stereotype.Service;

import com.example.Model.Cargo;
import com.example.Repository.CargoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {

    private final CargoRepository cargoRepository;

    CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public Cargo save(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    public Optional<Cargo> findById(Long id) {
        return cargoRepository.findById(id);
    }

    public void delete(Long id) {
        cargoRepository.deleteById(id);
    }
}
