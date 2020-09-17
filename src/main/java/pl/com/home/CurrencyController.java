package pl.com.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import pl.com.home.config.Currency;

@RestController
@RequestMapping("/currency")
@AllArgsConstructor
public class CurrencyController {
	private CurrencyService service;

	@GetMapping("/pln")
	public Currency pln() {
		return service.getPln();
	}

	@GetMapping("/usd")
	public Currency usd() {
		return service.getUsd();
	}
}
