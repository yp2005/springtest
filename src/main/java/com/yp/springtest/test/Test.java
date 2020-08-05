package com.yp.springtest.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        CarImpl car = new CarImpl();
//        CarProxy proxy = new CarProxy(car);
        car.drive();
//        proxy.drive();

//        Car carProxy = (Car) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("before runing...");
//                Object object = method.invoke(car, args);
//                System.out.println("after runing...");
//                return object;
//            }
//        });
//        carProxy.drive();
//
//        carProxy.toString();
        ProxyFactory proxyFactory = new ProxyFactory(car);
        Car carProxy = (Car)proxyFactory.getProxyInstance();
        carProxy.drive();
    }
}
