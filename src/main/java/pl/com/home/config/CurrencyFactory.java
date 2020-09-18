package pl.com.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrencyFactory {

	@Bean(name = "pln")
	public Currency pln() {
		return new Currency(-1l, "PLN", "Polski złoty", 1f);
	}

	@Bean(name = "usd")
	public Currency usd() {
		return new Currency(-1l, "USD", "Dolar amerykański", 4.13f);
	}
}
