package com.xrhm.javatutorial.学习.进阶.SPRING.SPRING事件机制;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/*
 *
 * */
@Service
public class UserService implements ApplicationEventPublisherAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void register(String username) {
        LOGGER.info("用户注册成功！");
        applicationEventPublisher.publishEvent(new UserRegisterEvent(username));

    }
}
