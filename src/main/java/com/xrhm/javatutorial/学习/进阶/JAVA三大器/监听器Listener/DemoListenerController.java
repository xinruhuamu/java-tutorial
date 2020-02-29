package com.xrhm.javatutorial.学习.进阶.JAVA三大器.监听器Listener;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author xinruhuamu
 * @version 版本号
 * @className DemoListener
 * @description TODO
 * @date 2020/2/21 15:02
 */
@RequestMapping(value = "listener")
@RestController
public class DemoListenerController {
    @RequestMapping(value = "onlineCount")
    @ResponseBody
    public Object getOnlineCount(HttpSession session) {
        System.out.println(session.getAttribute("count"));
        return session.getServletContext().getAttribute("count");
    }
}
