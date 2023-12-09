package br.com.ifpa.banco.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifpa.banco.modelo.ContaBancariaVersionada;

public interface ContaVersionadaRep extends JpaRepository<ContaBancariaVersionada, Long>{

}
