package com.example.provaBiblioteca.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.provaBiblioteca.Model.Livro;
import com.example.provaBiblioteca.Model.Bibliotecario;
import com.example.provaBiblioteca.Repository.LivroRepository;
import com.example.provaBiblioteca.Repository.BibliotecarioRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    @Autowired
    private BibliotecarioRepository bibliotecarioRepository;

    public List<Livro> listar(){
        return repository.findAll();
    }

    public Optional<Livro> findById(Long id) { 
        return repository.findById(id); 
    }

    public Livro salvar(Livro livro) {
    livro.setBibliotecario(
        bibliotecarioRepository.findById(livro.getBibliotecario().getId()).get()
    );
        return repository.save(livro);
    }

    public Livro atualizar(Livro livro) {
        return repository.save(livro);
    }

    public void delete(Long id) { 
        repository.deleteById(id); 
    }
}