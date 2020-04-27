package com.curso.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.curso.api.entities.Curso;
import com.curso.api.repositories.CursoRepository;

@Component
@Profile(value = "test")
public class TestaDatabase implements CommandLineRunner {

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Curso curso1 = new Curso("Graduação em TI", "Exatas");
		Curso curso2 = new Curso("Graduação em Economia", "Humanas");
		Curso curso3 = new Curso("Graduação em Administração", "Humanas");
		Curso curso4 = new Curso("Graduação em Educação Física", "Humanas");

		cursoRepository.save(curso1);
		cursoRepository.save(curso2);
		cursoRepository.save(curso3);
		cursoRepository.save(curso4);
	}
	
}
