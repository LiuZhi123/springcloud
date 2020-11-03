//package com.demo.util;
//
//
//import com.xxl.job.core.handler.annotation.XxlJob;
//import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
//import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
//import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
//import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.common.message.MessageExt;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//@Component
//public class messageConsumer {
//    @Autowired
//    private SendEmail sendEmail;
//    private final static Logger log = LoggerFactory.getLogger(messageConsumer.class);
//    private DefaultMQPushConsumer consumer;
//    @XxlJob("")
//    public void setConsumer() throws MQClientException {
//        consumer = new DefaultMQPushConsumer("test");
//        consumer.setNamesrvAddr("127.0.0.1:9876");
//        consumer.subscribe("testTopic","testTag");
//        consumer.registerMessageListener(new MessageListenerConcurrently() {
//            @Override
//            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
//                for (MessageExt msg:list){
//                    log.info("=-=-=-=-=-=-=");
//                    sendEmail.sendQQEmail(new String(msg.getBody()));
//                }
//
//                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//            }
//        });
//        consumer.start();
//        log.error("消费者启动成功");
//    }
//
//    public void closeConsumer(){
//        consumer.shutdown();
//    }
//}
