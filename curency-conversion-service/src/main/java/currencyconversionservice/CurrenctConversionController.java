package currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrenctConversionController {

	@GetMapping(path = "/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	// http://localhost:8083/currency-converter/from/USD/to/INR/quantity/30
	public CurrencyConverterBean converterCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		Map<String, String> uriVaribale = new HashMap<>();
		uriVaribale.put("from", from);
		uriVaribale.put("to", to);
		ResponseEntity<CurrencyConverterBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8082/currency/exchange/from/{from}/to/{to}", CurrencyConverterBean.class,
				uriVaribale);
		CurrencyConverterBean response = responseEntity.getBody();
		return new CurrencyConverterBean(response.getId(), from, to, response.getConversion(), quantity,
				quantity.multiply(response.getConversion()), response.getPort());
	}

}
