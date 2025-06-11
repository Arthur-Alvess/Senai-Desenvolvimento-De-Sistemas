package com.example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Model.Cargo;
import com.example.Service.CargoService;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoService cargoService;

    @PostMapping
    public Cargo create(@RequestBody Cargo cargo) {
        return cargoService.save(cargo);
    }

    @GetMapping
    public List<Cargo> getAll() {
        return cargoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cargo> getById(@PathVariable Long id) {
        return cargoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cargo> update(@PathVariable Long id, @RequestBody Cargo novoCargo) {
        return cargoService.findById(id).map(cargo -> {
            novoCargo.setId(cargo.getId());
            return ResponseEntity.ok(cargoService.save(novoCargo));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cargoService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
