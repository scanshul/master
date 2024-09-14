package ExceptionHandling;

class PaymentException extends Exception{
	public PaymentException(String message) {
		super(message);
	}
}

class PaymentService {
	public void processPayment(double amount) throws PaymentException {
		if(amount<=0) {
			throw new PaymentException("Paymnet should not 0 or less then 0");
		}
		else {
			System.out.println("Payment done");
		}
	}
}

public class EcommApp {
	
	public static void main(String[] args) throws PaymentException {
		PaymentService service = new PaymentService();
		service.processPayment(-10.23);
	}

}
