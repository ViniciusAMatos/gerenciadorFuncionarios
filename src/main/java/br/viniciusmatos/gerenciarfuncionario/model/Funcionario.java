package br.viniciusmatos.gerenciarfuncionario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String nome;
	private String email;
	private String cargo;
	private String telefone;
	private String imagemUrl;
	@Column(nullable = false, updatable = false)
	private String codigoFuncionario;
	
	
	public Funcionario() {
		
	}
	
	
	public Funcionario(Long id, String nome, String email, String cargo, String telefone, String imagemUrl,
			String codigoFuncionario) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cargo = cargo;
		this.telefone = telefone;
		this.imagemUrl = imagemUrl;
		this.codigoFuncionario = codigoFuncionario;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getImagemUrl() {
		return imagemUrl;
	}
	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}
	public String getCodigoFuncionario() {
		return codigoFuncionario;
	}
	public void setCodigoFuncionario(String codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}





	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", email=" + email + ", cargo=" + cargo + ", telefone="
				+ telefone + ", imagemUrl=" + imagemUrl + ", codigoFuncionario=" + codigoFuncionario + "]";
	}
	
	
	
	
	
	

}
