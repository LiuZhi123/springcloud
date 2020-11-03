package com.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {
    @Autowired
    private JavaMailSender sender;
    private final static Logger log = LoggerFactory.getLogger(SendEmail.class);
    public void sendQQEmail(String text){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1148918519@qq.com");
        message.setTo("39058951@qq.com");
        message.setSubject("这是测试邮件");
        message.setText(text);
        sender.send(message);
        log.info("邮件发送成功！");
    }

}
