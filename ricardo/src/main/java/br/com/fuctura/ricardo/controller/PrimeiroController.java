package br.com.fuctura.ricardo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.ricardo.model.Aluno;

// avisa ao spring que foi criado um controlador, e permite usar todas as funcionalidades da arquitetura rest
// @RestController e melhor que o @Controller pois usa as funcionalidades da arquitetura rest ex get, post, put, delete ...
@RestController

// cria um ideficandor para esse controlador para que ele possa ser encontrado
// "/ramal" vai ser o end point o endereco de acesso aos servicos
@RequestMapping("/alunos")

public class PrimeiroController {
//	localhost:porta/alunos/listar para exibir no navegador
//	o metodo listar restorna uma lista, entao ele pode ser udado para consultar informacoes por isso a anotation @GetMapping
	@GetMapping("/listar")
	public List<Aluno> listar() {
		Aluno a1 = new Aluno(1L, "11111111111", "Aluno 1");
		Aluno a2 = new Aluno(2L, "212121111111", "Aluno 2");
		Aluno a3 = new Aluno(3L, "31313131311", "Aluno 3");
//		cria uma variavel do tipo List<Aluno> passando um array com as variaveis do tipo Aluno a1, a2, a3
		List<Aluno> listarAlunos = Arrays.asList(a1, a2, a3);
		return listarAlunos;

	}

//	@GetMapping("/listar2")
//	public List<AlunoDto> listar2(){
//		Aluno aluno1 = new Aluno("11111111111", "Aluno 1", "aluno1@escola.com");
//		Aluno aluno2 = new Aluno("22222222222", "Aluno 2", "aluno2@escola.com");
//		Aluno aluno3 = new Aluno("33333333333", "Aluno 3", "aluno3@escola.com");
//		
//		List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3);
//		
//		List<AlunoDto> listaAlunosDTO = listaAlunos.stream().map(AlunoDto::new).collect(Collectors.toList());		
//
//		return listaAlunosDTO;
//	}
}
