package org.bedu.java.backend.postwork4;
import org.bedu.java.backend.postwork4.datos.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Postwork4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Postwork4Application.class, args);
	}

		@Override
		public void run(String... args) throws Exception {
			Scanner reader = new Scanner(System.in);

			System.out.println("Introduce un nombre: ");
			String name = reader.nextLine();

			System.out.println("Introduce un teléfono: ");
			String phone = reader.nextLine();
		}

		Person persona1 = new Person(name,phone);

		System.out.println(persona1);

	}

