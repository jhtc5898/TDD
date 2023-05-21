package ec.edu.ups.payment;

public class PaymentProcessor
{
    private IPaymentGateway gateway;

    public PaymentProcessor(IPaymentGateway gateway)
    {
        this.gateway=gateway;
    }

    public boolean makePayment(double amount)
    {
        PaymentRequest request=new PaymentRequest(amount);
        PaymentResponse response=gateway.requestPayment(request);
        if(response.getStatus()==PaymentResponse.PaymentStatus.OK)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
