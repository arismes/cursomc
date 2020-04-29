package com.estudoudemy.cursomc.repositories;

import com.estudoudemy.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
