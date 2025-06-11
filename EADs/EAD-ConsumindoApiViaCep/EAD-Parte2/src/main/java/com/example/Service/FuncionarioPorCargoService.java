package com.example.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.FuncionarioPorCargo;
import com.example.Repository.FuncionarioPorCargoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioPorCargoService {

    @Autowired
    private FuncionarioPorCargoRepository repository;

    public FuncionarioPorCargo save(FuncionarioPorCargo fpc) {
        return repository.save(fpc);
    }

    public List<FuncionarioPorCargo> findAll() {
        return repository.findAll();
    }

    public Optional<FuncionarioPorCargo> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<FuncionarioPorCargo> findByCargoId(Long cargo_Id) {
        return repository.findByCargoId(cargo_Id);
    }

    public List<FuncionarioPorCargo> findByFuncionarioId(Long funcionario_Id) {
        return repository.findByFuncionarioId(funcionario_Id);
    }
}