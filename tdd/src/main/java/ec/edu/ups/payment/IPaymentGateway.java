package ec.edu.ups.payment;

public interface IPaymentGateway {

    public PaymentResponse requestPayment(PaymentRequest request);

}
