package com.mario.jsonconsumer.listener;


import com.mario.jsonconsumer.model.Payment;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class JsonListener {

    @SneakyThrows
    @KafkaListener(topics = "payment-topics", groupId = "created-group", containerFactory = "jsonContainerFactory")
    public void antiFraud(@Payload Payment payment) {
        log.info("recebi o pagamento", payment.toString());
        Thread.sleep(2000);
        log.info("validando fraude...");
        Thread.sleep(2000);

        log.info("Compra aprovada");
        Thread.sleep(2000);
    }


    @SneakyThrows
    @KafkaListener(topics = "payment-topics", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
    public void pdfGenerator() {
        log.info("gerando pdf...");
        Thread.sleep(3000);
    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topics", groupId = "email-group", containerFactory = "jsonContainerFactory")
    public void sendEmail() {
        Thread.sleep(3000);
        log.info("enviando email de confirmacao fraude...");
    }
}
