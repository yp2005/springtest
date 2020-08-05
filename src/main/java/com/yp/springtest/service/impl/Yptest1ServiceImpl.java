package com.yp.springtest.service.impl;

import com.yp.springtest.entities.test.Yptest1;
import com.yp.springtest.repositories.Yptest1Repository;
import com.yp.springtest.service.Yptest1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Service
@Transactional
public class Yptest1ServiceImpl implements Yptest1Service {

    @Autowired
    private Yptest1Repository yptest1Repository;

    @Autowired
    private EntityManager entityManager;

    @Override
    public Yptest1 add(Yptest1 yptest1) {
        return this.yptest1Repository.save(yptest1);
    }

    @Override
    public Yptest1 get(Integer id) {
        return this.yptest1Repository.findById(id).get();
    }

    @Override
    public boolean decrAmount(Integer id, Double amount) {
        Query query = this.entityManager.createNativeQuery("update yptest_1 set amount = amount - :amount where id = :id and amount >= :amount");
        query.setParameter("amount", amount);
        query.setParameter("id", id);
        return query.executeUpdate() == 1;
    }
}
