package com.example.provaBiblioteca.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.provaBiblioteca.Model.Bibliotecario;
import com.example.provaBiblioteca.Repository.BibliotecarioRepository;

@Service
public class BibliotecarioService {

    @Autowired
    private BibliotecarioRepository repository;

    public List<Bibliotecario> listar(){
        return repository.findAll();
    }

    public Optional<Bibliotecario> findById(Long id) { 
        return repository.findById(id); 
    }

    public Bibliotecario salvar(Bibliotecario bibliotecario){
        return repository.save(bibliotecario);
    }

    public Bibliotecario atualizar(Bibliotecario bibliotecario) {
        return repository.save(bibliotecario);
    }

    public void delete(Long id) {
    if (repository.existsById(id)) {
        repository.deleteById(id);
    }
}
}
