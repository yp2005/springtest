package com.yp.springtest.controller;

import com.yp.springtest.entities.test.Yptest1;
import com.yp.springtest.service.Yptest1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private Yptest1Service yptest1Service;

    @GetMapping("hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("addYptest1")
    public Yptest1 addYptest1() {
        Yptest1 yptest1 = new Yptest1();
        yptest1.setKey("test1");
        yptest1.setAmount(100.0);
        return this.yptest1Service.add(yptest1);
    }

    @GetMapping("testDecr/{id}")
    public void testDecr(@PathVariable Integer id) {
        for(int i = 0; i < 100; i++) {
            new Thread(() -> {
                Yptest1 yptest1 = this.yptest1Service.get(id);
                System.out.println(Thread.currentThread().getName() + " decr before value: " + yptest1.getAmount());
                Boolean result = this.yptest1Service.decrAmount(id, 1.0);
                System.out.println(Thread.currentThread().getName() + " decr result: " + result);
                yptest1 = this.yptest1Service.get(id);
                System.out.println(Thread.currentThread().getName() + " decr after value: " + yptest1.getAmount());
            }, "thread" + i).start();
        }
    }
}
