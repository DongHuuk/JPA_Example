package com.back.example.springboot.jpa.dongexample.Inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Book")
public class Book extends Item{

    private String kinds;

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    @Override
    public String toString() {
        return "Book{" +
                "kinds='" + kinds + '\'' +
                '}';
    }
}
