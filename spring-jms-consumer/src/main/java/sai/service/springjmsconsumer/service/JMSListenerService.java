package sai.service.springjmsconsumer.service;

import dto.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMSListenerService {

//    @JmsListener(destination = "Consumer.myConsumer1.VirtualTopic.MY-SUPER-TOPIC")
//    public void receive(String myMessage) {
//        System.out.println("myMessage = " + myMessage);
//    }
//
//    @JmsListener(destination = "Consumer.myConsumer2.VirtualTopic.MY-SUPER-TOPIC")
//    public void receive1(String myMessage1) {
//        System.out.println("myMessage1 = " + myMessage1);
//    }


    @JmsListener(destination = "Consumer.myConsumer2.VirtualTopic.MY-SUPER-TOPIC")
    public void receive1(Message myMessage1) {
        System.out.println("myMessage1 = " + myMessage1);
    }
}
