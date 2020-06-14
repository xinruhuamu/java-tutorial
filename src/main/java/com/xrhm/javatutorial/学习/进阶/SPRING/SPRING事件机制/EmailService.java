package com.xrhm.javatutorial.学习.进阶.SPRING.SPRING事件机制;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

public class EmailService implements ApplicationListener<UserRegisterEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        LOGGER.info("用户注册成功了，现在给用户" + event.getSource() + "发送邮件~");
    }
}
