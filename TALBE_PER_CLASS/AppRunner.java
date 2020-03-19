package com.back.example.springboot.jpa.dongexample;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class AppRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        save();

    }

    private void save() {
        Album album = new Album();
        album.setName("album1");
        album.setPrice(1300);
        album.setArtist("dong");
        entityManager.persist(album);
//
        Book book = new Book();
        book.setName("JPA");
        book.setPrice(43000);
        book.setKinds("IT");
        entityManager.persist(book);
//
        Food food = new Food();
        food.setBeef("checken");
        food.setName("good");
        food.setPrice(19000);
        entityManager.persist(food);
    }
}
