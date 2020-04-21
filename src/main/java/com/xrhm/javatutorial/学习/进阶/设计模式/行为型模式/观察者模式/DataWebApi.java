package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.观察者模式;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Observable;
import java.util.Observer;

@RestController
@RequestMapping("/")
public class DataWebApi extends Observable {
    private int pageNum;

    @RequestMapping(value = "/data/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getDataByPage(@PathVariable("id") int o) {
        this.setPageNum(o);
        System.out.println("获取分页数据，按页返回");
        super.setChanged();
        super.notifyObservers("分页查询");

        return "Page codes";
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
