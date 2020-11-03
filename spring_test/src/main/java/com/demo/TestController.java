package com.demo;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.demo.entity.Url;
import com.demo.service.shortUrlService;
//import com.demo.util.messageConsumer;
import com.demo.util.shortUrlUtil;
//import com.demo.util.sendMessageUtil;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/config")
@ResponseBody
public class TestController {
//    @Autowired
//    private messageConsumer consumer;
//    @Resource
//    private sendMessageUtil sendMessageUtil;
    @Resource
    private shortUrlUtil shortUrl1;
    @Resource
    private shortUrlService shortUrlService;
//    @NacosValue(value = "${local:false}",autoRefreshed = true)
//    private String local;
//    @Value("${nacos.config.server-addr}")
    private String name;
//    @RequestMapping(value = "/get",method = RequestMethod.GET)
//    public String get(){
//        return local;
//    }
//    @RequestMapping("/send")
//    public void send(@RequestParam String message1) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
//        List<SendResult> list = new ArrayList<SendResult>();
//        Message message = new Message("testTopic","testTag",message1.getBytes());
//        SendResult sendResult = sendMessageUtil.getMqProducer().send(message);
//        System.out.println("消息"+sendResult.getSendStatus().toString());
//    }

//    @RequestMapping("/push")
//    public void recive() throws MQClientException {
//        consumer.setConsumer();
//    }

    @RequestMapping("/short")
    public String shortUrl(@RequestParam String url){
        String[] urls = shortUrl1.shortUrl(url);
        Url url1 = new Url();
        url1.setLong_url(url);
        url1.setShort_url(urls[0]);
        shortUrlService.insert(url1);
        return urls[0];
    }
    @RequestMapping("/provider")
    public String test(){
        return "success";
    }
}
