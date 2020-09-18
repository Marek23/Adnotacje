package pl.com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.com.home.config.Currency;

@Service
public class CurrencyService {
	@Autowired
	@Qualifier("pln")
	Currency pln;

	@Autowired
	@Qualifier("usd")
	Currency usd;

	public Currency getPln() {
		return pln;
	}

	public Currency getUsd() {
		return usd;
	}
}
