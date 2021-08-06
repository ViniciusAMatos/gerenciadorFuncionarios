package br.viniciusmatos.gerenciarfuncionario.services;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.viniciusmatos.gerenciarfuncionario.exception.UserNotFoundException;
import br.viniciusmatos.gerenciarfuncionario.model.Funcionario;
import br.viniciusmatos.gerenciarfuncionario.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	private final FuncionarioRepository funcionarioRepository;
	
	
	@Autowired
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	public Funcionario insert(Funcionario funcionario) {
		funcionario.setCodigoFuncionario(UUID.randomUUID().toString());
		return funcionarioRepository.save(funcionario);
	}
	
	public List<Funcionario> findAllFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
	public Funcionario atualizarFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
	public Funcionario buscarFuncionarioPorId(Long id) {
		return funcionarioRepository.buscarFuncionarioPorId(id).orElseThrow(()-> new UserNotFoundException("Usuario do Id: "+ id+ " Não foi encontrado"));
	}
	
	public void excluirFuncionario(Long id) {
		funcionarioRepository.deletarFuncionarioPorId(id);
	}

}
