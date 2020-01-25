package br.com.teste.gft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.teste.gft.dialogo.Dialogo;

@SpringBootApplication
public class TesteGftApplication implements CommandLineRunner {

	@Autowired
	private Dialogo dialogo;
	
	public static void main(String[] args) {
		SpringApplication.run(TesteGftApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.dialogo.iniciaDialogo();
	}


}
