package com.service.payment.resource.impl;

import com.service.payment.resource.PaymentResource;
import com.service.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payment")
@RequiredArgsConstructor
public class PaymentResouceImpl implements PaymentResource {

    private final PaymentService paymentService;
    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        paymentService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
