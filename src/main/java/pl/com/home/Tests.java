package pl.com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import pl.com.home.config.Currency;
import pl.com.home.config.CurrencyRepository;

import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
@EnableJpaRepositories(basePackages   = "pl.com.home.config")
@EnableMongoRepositories(basePackages = "pl.com.home.nosqlconfig")
public class Tests {

	@Autowired
	MongoTemplate template;
	
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
			template.save(c, "currency");

			c = new Currency();
			c.setName("Dolar amerykański");
			c.setType("USD");
			c.setFactor(4.14f);
			repository.save(c);
			template.save(c, "currency");

			repository.findAll().forEach(System.out::println);
		};
	};
}
