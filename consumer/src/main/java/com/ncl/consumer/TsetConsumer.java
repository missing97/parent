package com.ncl.consumer;

import com.ncl.api.IService;
import com.ncl.api.Request;
import com.ncl.api.Response;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TsetConsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext s = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        s.start();
        IService ss = (IService) s.getBean("IService");
        Request request = new Request();
        request.setCode("1111111");
        request.setName("scc");
        Response s1= ss.test(request);
        System.out.println(s1);
        System.in.read();
    }
}
