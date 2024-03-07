package com.bernardo.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bernardo.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
