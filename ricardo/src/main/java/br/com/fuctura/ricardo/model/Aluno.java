package br.com.fuctura.ricardo.model;

import java.util.Objects;

public class Aluno {

	private Long id;
	private String cpf;
	private String nome;
	private String email;
	private String fone;
//	 Tipo pode ser CONVENCIONAL ou MONITOR
	private String tipo = TipoAluno.CONVENCIONAL.toString();

//    constructor padrao generate constructors from superclass...

	public Aluno() {

	}

//	construtor com os atributos   generate constructor using fields
	public Aluno(Long id, String cpf, String nome) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
	}

//	getters/setters generate getters and setters ...

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

//	toString() hashCode() e equals()
//	toString() serve para debugar e saber se os valores de um ojeto que foi criado estao corretos 
	@Override
	public String toString() {
		return "Aluno => [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", fone=" + fone
				+ ", tipo=" + tipo + "]";
	}

//	hashCode() e equals cria um id unico para o objeto na maquina virtual, quando o java compilar ele vai saber direfereciar uma instacia da outra

	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, fone, id, nome, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email) && Objects.equals(fone, other.fone)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(tipo, other.tipo);
	}

}
