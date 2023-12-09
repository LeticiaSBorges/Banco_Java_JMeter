package br.com.ifpa.banco.modelo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class ContaBancariaVersionada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeTitular;
	private float saldoConta;

	@Version
	private Date ultimaAlteracaoConta;

	public ContaBancariaVersionada() {
		
	}

	public ContaBancariaVersionada(Long id, String nomeTitular, float saldoConta) {
		this.setId(id);
		this.setNomeTitular(nomeTitular);
		this.setSaldoConta(saldoConta);
	}

	public Date getUltimaAlteracaoConta() {
		return ultimaAlteracaoConta;
	}

	public void setUltimaAlteracaoConta(Date ultimaAlteracaoConta) {
		this.ultimaAlteracaoConta = ultimaAlteracaoConta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public float getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}

}
