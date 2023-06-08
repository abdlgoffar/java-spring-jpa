package com.spring.jpa.orm;

import com.spring.jpa.orm.services.CategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionTesting {
    @Autowired
    private CategoryService categoryService;

    @Test
    void failedTransactional() {
        this.categoryService.create();
    }

    @Test
    void successTransactional() {
        this.categoryService.operationDatabaseWithTransaction();
    }
}
