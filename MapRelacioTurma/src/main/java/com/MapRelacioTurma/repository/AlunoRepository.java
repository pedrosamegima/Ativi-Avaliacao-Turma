package com.MapRelacioTurma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MapRelacioTurma.entities.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno,Long> {

}
