package com.example.provaBiblioteca.Model;

import java.time.LocalDate;

import com.example.provaBiblioteca.Enum.StatusLivro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Livro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bibliotecario_id", nullable = false)
    private Bibliotecario bibliotecario;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "autor", nullable = false)
    private String autor;

    @Column(name = "genero", nullable = false)
    private String genero;

    @Column(name = "status", nullable = false)
    private StatusLivro status;

    @Column(name = "data", nullable = false)
    private LocalDate dataCadastro;
}
