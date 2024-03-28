package com.MapRelacioTurma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MapRelacioTurma.entities.Turma;
import com.MapRelacioTurma.repository.TurmaRepository;

@Service
public class TurmaService {
	private final TurmaRepository turmaRepository;

	@Autowired
    public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }
	
	  public List<Turma> getAllTurma() {
	        return turmaRepository.findAll();
	    }

	    public Turma getTurmaById(Long id) {
	        Optional<Turma> produto = turmaRepository.findById(id);
	        return produto.orElse(null);
	    }

	    public Turma salvarTurma(Turma turma) {
	        return turmaRepository.save(turma);
	    }

	    public Turma updateTurma(Long id, Turma updatedTurma) {
	        Optional<Turma> existingTurma = turmaRepository.findById(id);
	        if (existingTurma.isPresent()) {
	            updatedTurma.setId(id);
	            return turmaRepository.save(updatedTurma);
	        }
	        return null;
	    }

	    public boolean deleteTurma(Long id) {
	        Optional<Turma> existingTurma = turmaRepository.findById(id);
	        if (existingTurma.isPresent()) {
	        	turmaRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
	   


}

