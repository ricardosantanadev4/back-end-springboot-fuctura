package br.com.fuctura.ricardo.dto;

import br.com.fuctura.ricardo.model.Aluno;

public class AlunoDto {

	private String cpf;
	private String nome;
	private String email;

	public AlunoDto(Aluno aluno) {
		this.cpf = aluno.getCpf();
		this.nome = aluno.getNome();
		this.email = aluno.getEmail();
	}

	// getters aqui
	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

}
