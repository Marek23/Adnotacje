package pl.com.home;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import pl.com.home.config.Currency;
import pl.com.home.config.CurrencyRepository;

@SpringBootApplication
public class Tests {

	public static void main(String[] args) {
		SpringApplication.run(Tests.class, args);
	}

	@Bean
	ApplicationRunner init(CurrencyRepository repository) {
		return args -> {
			Currency c = new Currency();
			c.setName("Polski złoty");
			c.setType("PLN");
			c.setFactor(1f);
			repository.save(c);

			c = new Currency();
			c.setName("Dolar amerykański");
			c.setType("USD");
			c.setFactor(4.14f);
			repository.save(c);

			repository.findAll().forEach(System.out::println);
		};
	};
}
