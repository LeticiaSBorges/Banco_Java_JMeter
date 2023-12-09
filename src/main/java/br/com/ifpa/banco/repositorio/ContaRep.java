package br.com.ifpa.banco.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifpa.banco.modelo.ContaBancaria;

public interface ContaRep extends JpaRepository<ContaBancaria, Long>{

}
