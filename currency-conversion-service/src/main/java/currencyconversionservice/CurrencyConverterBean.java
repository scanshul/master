package currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConverterBean {
	private Long id;
	private String currencyfrom;
	private String currencyto;
	private BigDecimal conversion;
	private BigDecimal quantiy;
	private BigDecimal calculatedAmount;
	private int port;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurrencyfrom() {
		return currencyfrom;
	}

	public void setCurrencyfrom(String currencyfrom) {
		this.currencyfrom = currencyfrom;
	}

	public String getCurrencyto() {
		return currencyto;
	}

	public void setCurrencyto(String currencyto) {
		this.currencyto = currencyto;
	}

	public BigDecimal getConversion() {
		return conversion;
	}

	public void setConversion(BigDecimal conversion) {
		this.conversion = conversion;
	}

	public BigDecimal getQuantiy() {
		return quantiy;
	}

	public void setQuantiy(BigDecimal quantiy) {
		this.quantiy = quantiy;
	}

	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}

	public void setCalculatedAmount(BigDecimal calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public CurrencyConverterBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrencyConverterBean(Long id, String currencyfrom, String currencyto, BigDecimal conversion,
			BigDecimal quantiy, BigDecimal calculatedAmount,int port) {
		super();
		this.id = id;
		this.currencyfrom = currencyfrom;
		this.currencyto = currencyto;
		this.conversion = conversion;
		this.quantiy = quantiy;
		this.calculatedAmount = calculatedAmount;
		this.port =port;
	}

}
