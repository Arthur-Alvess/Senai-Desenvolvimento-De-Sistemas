package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Funcionario;
import com.example.Repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repo;

    public Funcionario save(Funcionario f) { 
        return repo.save(f); 
    }
    public List<Funcionario> findAll() {
        return repo.findAll(); 
    }
    public Optional<Funcionario> findById(Long id) { 
        return repo.findById(id); 
    }

    public Funcionario atualizar(Funcionario funcionario) {
        return repo.save(funcionario);
    }

    public void delete(Long id) { 
        repo.deleteById(id); 
    }
}
