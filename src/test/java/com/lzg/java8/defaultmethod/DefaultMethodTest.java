package com.lzg.java8.defaultmethod;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * @Author: lzg
 * @Date: 2020-12-09 17:10
 */
public class DefaultMethodTest {

    /**
     * In this example, we don't need to use the default method send() from PaymentService interface
     */
    @Test
    public void shouldRetrieveTheDefaultFees() throws Exception {
        PaymentService service = new PayPalPaymentService();

        double fees = service.retrieveDefaultFees();

        System.out.println(fees);
    }

    @Test
    public void shouldInvokeTheDefaultMethodFromPaymentService() throws Exception {
        PaymentService paymentService = new PayPalPaymentService();

        double valueSent = paymentService.send(20);

        System.out.println(valueSent);

    }
}


interface PaymentService {

    double retrieveDefaultFees();

    default double send(double value) {
        System.out.println("Sending the value: " + value);

        return value;
    }

}

class PayPalPaymentService implements PaymentService{

    @Override
    public double retrieveDefaultFees() {
        return 10.9;
    }

}