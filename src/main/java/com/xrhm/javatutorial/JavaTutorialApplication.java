package com.xrhm.javatutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTutorialApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaTutorialApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JavaTutorialApplication.class, args);
        LOGGER.info("===============================================启动成功！=============================================");
    }

}
