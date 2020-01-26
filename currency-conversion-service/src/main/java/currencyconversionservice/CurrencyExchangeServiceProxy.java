package currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( url = "localhost:8082" , name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping(path = "/currency/exchange/from/{from}/to/{to}")
	public CurrencyConverterBean retriveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

}
