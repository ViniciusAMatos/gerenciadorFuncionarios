package br.viniciusmatos.gerenciarfuncionario.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.viniciusmatos.gerenciarfuncionario.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	void deletarFuncionarioPorId(Long id);

	Optional<Funcionario> buscarFuncionarioPorId(Long id);

}
