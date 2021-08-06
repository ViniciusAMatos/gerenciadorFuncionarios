package br.viniciusmatos.gerenciarfuncionario.resources;

import java.util.List;

import javax.persistence.PostRemove;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.viniciusmatos.gerenciarfuncionario.model.Funcionario;
import br.viniciusmatos.gerenciarfuncionario.services.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioResource {

	private final FuncionarioService funcionarioService;

	public FuncionarioResource(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Funcionario>> getTodosFuncionarios() {
		List<Funcionario> funcionarios = funcionarioService.findAllFuncionarios();
		return new ResponseEntity<List<Funcionario>>(funcionarios, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Funcionario> getFuncionario(@PathVariable("id") Long id) {
		Funcionario funcionario = funcionarioService.buscarFuncionarioPorId(id);
		return new ResponseEntity<Funcionario>(funcionario, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Funcionario> addFuncionario(@RequestBody Funcionario funcionario) {
		Funcionario newFuncionario = funcionarioService.insert(funcionario);
		return new ResponseEntity<Funcionario>(newFuncionario, HttpStatus.CREATED);

	}

	@PutMapping("/atualizar")
	public ResponseEntity<Funcionario> atualizarFuncionario(@RequestBody Funcionario funcionario) {
		Funcionario newFuncionario = funcionarioService.insert(funcionario);
		return new ResponseEntity<Funcionario>(newFuncionario, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Funcionario> excluirFuncionario(@PathVariable("id") Long id) {
		funcionarioService.excluirFuncionario(id);
		return new ResponseEntity<Funcionario>(HttpStatus.OK);
	}


}
