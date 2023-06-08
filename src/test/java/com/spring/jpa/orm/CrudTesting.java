package com.spring.jpa.orm;

import com.spring.jpa.orm.entities.Category;
import com.spring.jpa.orm.repositories.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

//contoh cara pembuatan operasi crud pada spring data jpa.
@SpringBootTest
public class CrudTesting {
    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void createTest() {
        //contoh cara insert data
        Category category = new Category("pakaian wanita");
        this.categoryRepository.save(category);
    }
    @Test
    void readTest() {
        //select * data
        List<Category> all = this.categoryRepository.findAll();
        for (Category category : all) {
            System.out.println(category.getName());
        }
    }
    @Test
    void updateTest() {
        //update data by id
        Optional<Category> byId = this.categoryRepository.findById("15455ed7-5bc1-41e2-9144-fe7718c7baf5");
        Category category = byId.get();
        category.setName("pakaian pria");
        this.categoryRepository.save(category);
    }
    @Test
    void deleteTest() {
        //delete data by id
        this.categoryRepository.deleteById("8ce7aaa2-8e70-46e7-94e7-59d64a344671");
    }
}
