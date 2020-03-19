package com.back.example.springboot.jpa.dongexample.Inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Food")
public class Food extends Item{

    private String beef;

    public String getBeef() {
        return beef;
    }

    public void setBeef(String beef) {
        this.beef = beef;
    }

    @Override
    public String toString() {
        return "Food{" +
                "beef='" + beef + '\'' +
                '}';
    }
}
