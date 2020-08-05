package com.yp.springtest.service;

import com.yp.springtest.entities.test.Yptest1;

public interface Yptest1Service {
    Yptest1 add(Yptest1 yptest1);

    Yptest1 get(Integer id);

    boolean decrAmount(Integer id, Double amount);
}
