package currencyexchangesservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environemrnt;
	
	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;

	@GetMapping(path = "/currency/exchange/from/{from}/to/{to}")
	public Exchangeobject retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		//Exchangeobject ex = new Exchangeobject(1000L, from, to, BigDecimal.valueOf(65));
		Exchangeobject ex = currencyExchangeRepository.findByCurrencyfromAndCurrencyto(from, to);
		ex.setPort(Integer.parseInt(environemrnt.getProperty("local.server.port")));
		return ex; 

	}

}
