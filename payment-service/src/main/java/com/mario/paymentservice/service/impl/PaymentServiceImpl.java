package com.mario.paymentservice.service.impl;

import com.mario.paymentservice.model.Payment;
import com.mario.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_IMPL ::: Recebi pagamento {}", payment);
    }
}
