package com.yp.springtest.repositories;

import com.yp.springtest.entities.test.Yptest1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Yptest1Repository extends JpaRepository<Yptest1, Integer>, JpaSpecificationExecutor<Yptest1> {

    @Query(nativeQuery = true, value = "update yptest_1 set amount = amount - :amount where id = :id and amount >= :amount")
    void decrAmount(@Param("id") Integer id, @Param("amount") Double amount);
}
