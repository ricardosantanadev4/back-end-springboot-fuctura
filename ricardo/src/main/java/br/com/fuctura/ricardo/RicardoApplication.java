package br.com.fuctura.ricardo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// essa anotation e unica e indica que o boot (ponto de partida) sera feito nessa classe
// anotation avisa ao sprig que quando encontrar a classe SpringBootApplication ele vai executar o que esta dentro do metodo main
@SpringBootApplication


@RestController
public class RicardoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RicardoApplication.class, args);
	}

	
//	quando for http://localhost:8080/ exib a string do metodo helo a baixo no lugar de apresentar o erro padrao
//	faz o mapeamento para o /
//	@RequestMapping("/")
//	@ResponseBody
	public String helo() {
		return "<h1> Parabéns aluno, vc conseguiu!</h1>";
	}

}
