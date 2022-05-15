package sai.service.springjmsproducer.controller;

import dto.Message;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("/send/{name}")
    public String sendNameInJms(@PathVariable String name) {
        try {
            jmsTemplate.convertAndSend(new ActiveMQTopic("VirtualTopic.MY-SUPER-TOPIC"), name);
            return "message sent in the topic";
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            return "Failed!!!";
        }

    }

    @PostMapping("/post")
    public String postDataToQueue(@RequestBody Message message) {
        try {
            jmsTemplate.convertAndSend(new ActiveMQTopic("VirtualTopic.MY-SUPER-TOPIC"), message);
            return "message sent in the topic";
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            return "Failed!!!";
        }
    }
}
