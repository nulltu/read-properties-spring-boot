package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private Environment env;

	@Value("${propiedad.nombre}")
	String nombre;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(env.getProperty("propiedad.nombre"));
		System.out.println(nombre);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}
