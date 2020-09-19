package pl.com.home.nosqlconfig;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pl.com.home.config.Currency;


@Repository
public interface CurrencyMongoRepository extends MongoRepository<Currency, String> {
}
