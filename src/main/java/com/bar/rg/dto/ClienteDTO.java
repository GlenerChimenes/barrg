package com.bar.rg.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.bar.rg.domain.Cliente;
import com.bar.rg.service.validation.ClienteUpdate;

@ClienteUpdate
public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotEmpty(message="Preenchimento obrigatório!")
	@Length(min=5, max=80, message="O tamanho deve ser entre 5 e 120 caracter" )
	private String nome;
	
	@NotEmpty(message="Email inválido!")
	@Email
	private String email;
	

	public ClienteDTO() {

	}

	public ClienteDTO(Cliente obj) {
			
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
