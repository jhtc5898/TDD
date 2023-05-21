package ec.edu.ups.payment;

import static org.junit.Assert.*;

import ec.edu.ups.payment.PaymentResponse.PaymentStatus;
import org.junit.Test;
import org.mockito.Mockito;

public class PaymentProcessorTest {

    IPaymentGateway gateway = Mockito.mock(IPaymentGateway.class);
    PaymentProcessor processor = new PaymentProcessor(gateway);
    @Test
    public void given_payment_when_is_correct_then_ok() {
        Mockito.when(gateway.requestPayment(Mockito.any()))
            .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(processor.makePayment(100));


    }

    @Test
    public void given_payment_when_is_correct_then_false() {

        Mockito.when(gateway.requestPayment(Mockito.any()))
            .thenReturn(new PaymentResponse(PaymentStatus.ERROR));

        assertFalse(processor.makePayment(100));


    }
}