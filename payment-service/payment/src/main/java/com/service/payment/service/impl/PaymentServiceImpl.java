package com.service.payment.service.impl;

import com.service.payment.service.PaymentService;
import java.io.Serializable;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import model.Payment;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;
    @Override
    public void sendPayment(Payment payment) {
        log.info("received payment:{}", payment);

        kafkaTemplate.send("payment-topic", payment);
        log.info("message send to topic");
    }
}
