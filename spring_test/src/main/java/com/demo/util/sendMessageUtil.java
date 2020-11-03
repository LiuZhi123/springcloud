//package com.demo.util;
//
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.springframework.stereotype.Component;
//
//@Component
//public class sendMessageUtil {
//    private DefaultMQProducer mqProducer;
//
//    public sendMessageUtil() throws MQClientException {
//        mqProducer = new DefaultMQProducer("test");
//        mqProducer.setNamesrvAddr("10.25.1.144:9876");
//        mqProducer.setInstanceName("producer");
//        mqProducer.start();
//    }
//
//    public DefaultMQProducer getMqProducer(){
//        return this.mqProducer;
//    }
//
//    public void closeProducer(){
//        this.mqProducer.shutdown();
//    }
//
//}

