package currencyexchangesservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<Exchangeobject, Long> {
	
	Exchangeobject findByCurrencyfromAndCurrencyto(String from ,String to);
	//findByCurrencyfromAndCurrencyto : same as column name

}
