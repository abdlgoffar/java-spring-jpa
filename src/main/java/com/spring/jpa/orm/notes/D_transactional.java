package com.spring.jpa.orm.notes;

public class D_transactional {
    //transactional adalah fitur untuk melakukan database transaction di spring data jpa, cara menggunakan fitur
    //transactional pada spring cukup menggunakan annotation @Transactional pada method operasi crud repository.
    //sebenarnya fitur transactional akan dilaksanakan ketika method yang diberi annotation @Transactional di panggil pada service lain
    //misal pada service controller.
    //untuk mengetahui cara pembuatan transactional lihat di package service class CategoryService.
}
