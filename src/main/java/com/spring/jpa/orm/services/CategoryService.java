package com.spring.jpa.orm.services;

import com.spring.jpa.orm.entities.Category;
import com.spring.jpa.orm.repositories.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    //contoh cara pembuatan transactional atau transaction database pada spring data jpa.
    @Transactional
    public void create() {
        for (int i = 5; i < 10; i++) {
            Category category = new Category("category " + i);
            this.categoryRepository.save(category);
        }
        throw new RuntimeException("please rollback transaction");
    }

    public void operationDatabaseWithTransaction() {
        this.create();
    }
    //untuk mencapai sebuah transaction database commit/success pada spring data jpa, maka semua operation crud repository yang berada di dalam
    //method @Transactional harus dieksekusi, karena jika terdapat operation crud repository yang  berada di dalam method @Transactional
    //tidak dieksekusi maka transaction database akan di rollback/digagalkan.
}
//untuk mengetahui test code ini lihat di package test class TransactionTesting.