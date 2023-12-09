package br.com.ifpa.banco.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpa.banco.modelo.ContaBancaria;
import br.com.ifpa.banco.modelo.ContaBancariaVersionada;
import br.com.ifpa.banco.repositorio.ContaRep;
import br.com.ifpa.banco.repositorio.ContaVersionadaRep;

@RestController
public class ContaBancariaControlador {

	@Autowired
	private ContaRep contasRep;
	
	@Autowired
	private ContaVersionadaRep contasVersionadasRep;

	@GetMapping("/listagem/contas")
	public List<ContaBancaria> listarContas() {
		return contasRep.findAll();
	}
        
        @PutMapping("/depositar/conta/{id}")
	public String depositar(@PathVariable Long id, @RequestParam float valor) {
		ContaBancaria conta = contasRep.findById(id).orElse(null);
		conta.setSaldoConta(conta.getSaldoConta() + valor);
		contasRep.save(conta);
		return "Deposito realizado com sucesso!!!";
	}
        
        @PutMapping("/retirar/conta/{id}")
	public String retirar(@PathVariable Long id, @RequestParam float valor) {
		ContaBancaria conta = contasRep.findById(id).orElse(null);
		if (conta.getSaldoConta() >= valor) {
			conta.setSaldoConta(conta.getSaldoConta() - valor);
			contasRep.save(conta);
			return "Retirada realizada com sucesso!!!";
		} else {
			return "Saldo insuficiente para realizar a retirada.";
		}
	}
	
	@GetMapping("/listagem/contas/versionadas")
	public List<ContaBancariaVersionada> listarContasVersionadas() {
		return contasVersionadasRep.findAll();
	}	
	
	@PutMapping("/depositar/conta/versionada/{id}")
	public String depositarContaVersionada(@PathVariable Long id, @RequestParam float valor) {
		ContaBancariaVersionada conta = contasVersionadasRep.findById(id).orElse(null);
		conta.setSaldoConta(conta.getSaldoConta() + valor);
		contasVersionadasRep.save(conta);
		return "Deposito realizado com sucesso!!!";
	}
	
	@PutMapping("/retirar/conta/versionada/{id}")
	public String retirarContaVersionada(@PathVariable Long id, @RequestParam float valor) {
		ContaBancariaVersionada conta = contasVersionadasRep.findById(id).orElse(null);
		if (conta.getSaldoConta() >= valor) {
			conta.setSaldoConta(conta.getSaldoConta() - valor);
			contasVersionadasRep.save(conta);
			return "Retirada realizada com sucesso!!!";
		} else {
			return "Saldo insuficiente para realizar a retirada.";
		}
	}

}

