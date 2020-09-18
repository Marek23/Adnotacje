package pl.com.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import pl.com.home.config.Currency;
import pl.com.home.config.CurrencyRepository;

@RestController
@AllArgsConstructor
public class CurrencyController {
	private CurrencyRepository repository;

	@GetMapping("/currency")
	public Currency currency(@RequestParam(name = "id") Long id ) {
		return repository.findById(id).get();
	}

	@GetMapping("/currency/{type}")
	public Currency currency(@PathVariable("type") String type ) {
		return repository.findByType(type.toUpperCase());
	}
}
