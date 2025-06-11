package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.FuncionarioPorCargo;

@Repository
public interface FuncionarioPorCargoRepository extends JpaRepository<FuncionarioPorCargo, Long> {
    List<FuncionarioPorCargo> findByCargoId(Long cargo);
    List<FuncionarioPorCargo> findByFuncionarioId(Long funcionario);
}