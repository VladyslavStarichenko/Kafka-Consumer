package com.goldsilver.consumer;

import com.goldsilver.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "goldsilver-event-topic", groupId = "goldsilver-1")
    public void consume1(Customer customer) {
        logger.info("consumer consumed the message {} ", customer.toString());
    }

//    @KafkaListener(topics = "goldsilver-event-topic", groupId = "goldsilver")
//    public void consume2(String message) {
//        logger.info("consumer 2 consumed the message {} ", message);
//    }
//
//    @KafkaListener(topics = "goldsilver-event-topic", groupId = "goldsilver")
//    public void consume3(String message) {
//        logger.info("consumer 3 consumed the message {} ", message);
//    }
//
//    @KafkaListener(topics = "goldsilver-event-topic", groupId = "goldsilver")
//    public void consume4(String message) {
//        logger.info("consumer 4 consumed the message {} ", message);
//    }
}
