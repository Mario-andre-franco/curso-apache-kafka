package com.mario.paymentservice.service;

import com.mario.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
