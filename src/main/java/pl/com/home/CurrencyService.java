package pl.com.home;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import pl.com.home.config.Currency;

@Service
@AllArgsConstructor
public class CurrencyService {

	@Qualifier("pln")
	Currency pln;

	@Qualifier("usd")
	Currency usd;

	public Currency getPln() {
		return pln;
	}

	public Currency getUsd() {
		return usd;
	}
}
