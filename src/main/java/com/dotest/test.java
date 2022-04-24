package com.dotest;

import com.myclass.People;
import com.service.serviceimpl.serviceinterfaceImpl;
import javafx.scene.shape.PathElement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    public static void main(String[] args) {
        String config="spring.xml";
//创建容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
//从容器中获取service类的对象
        serviceinterfaceImpl  service= (serviceinterfaceImpl) ac.getBean("peopleservice");
//执行查询语句,并展示查询结果
        People selectbyid = service.selectbyid(1);
        System.out.println(selectbyid);
    }
}
