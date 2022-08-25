package br.com.fuctura.ricardo.model;

import br.com.fuctura.ricardo.controller.PrimeiroController;

public class TesteAluno {

	public static void main(String[] args) {
// exibe no console o metodo listar do PrimeiroController
		PrimeiroController controller = new PrimeiroController();
//		Aluno a1 = new Aluno(1L, "11111111111", "Aluno 1");	
//		Aluno a2 = new Aluno(2L, "212121111111", "Aluno 2");
//		Aluno a3 = new Aluno(3L, "31313131311", "Aluno 3");
		System.out.println(controller.listar());
//		System.out.println(a2);
//		System.out.println(a3);
	}
}
