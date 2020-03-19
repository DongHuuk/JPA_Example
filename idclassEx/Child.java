package com.back.example.springboot.jpa.dongexample.Inheritance;

import javax.persistence.*;

@Entity
@IdClass(ChildId.class)
public class Child {

    @Id
    @Column(name = "CHILD_ID")
    private String chileId;

    @Id
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public String getchileId() {
        return chileId;
    }

    public void setId(String id) {
        this.chileId = chileId;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id='" + chileId + '\'' +
                ", parent=" + parent +
                '}';
    }
}
