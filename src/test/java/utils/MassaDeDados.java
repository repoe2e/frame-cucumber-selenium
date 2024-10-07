package utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import com.github.javafaker.Faker;

public class MassaDeDados {

	private Faker faker = new Faker();
	private Random random = new Random();

	public String gerarNome() {

		return faker.name().name();
	}

	public String gerarSobrenome() {

		return faker.name().lastName();
	}

	public String gerarNomeCompleto() {
		return faker.name().fullName();
	}

	public String gerarEmail() {
		return faker.internet().emailAddress();
	}

	public String gerarEndereco() {
		return faker.address().streetAddress();
	}

	public String gerarDataNacimento() {
		Date dataNascimento = faker.date().birthday(18, 65);
		// Converter para LocalDate
		LocalDate localDate = dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		// Formar a data no padrão "ddMMyyyy"
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
		return localDate.format(formatter);
	}

	public String gerarRg() {
		return faker.number().digits(10);
	}

	String[] estadosBrasileiros = { "SP", "RO", "PB", "MG" };

	public String gerarEstado() {
		int index = random.nextInt(estadosBrasileiros.length);
		return estadosBrasileiros[index];
	}

}
