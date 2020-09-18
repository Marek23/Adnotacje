package pl.com.home.config;

import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {
	public Currency findByType(String type);
}