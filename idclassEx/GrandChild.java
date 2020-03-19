package com.back.example.springboot.jpa.dongexample.Inheritance;

import javax.persistence.*;

@Entity
@IdClass(GrandChildId.class)
public class GrandChild {

    @Id
    @Column(name = "GRANDCHILD_ID")
    private String grandId;

    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID"),
            @JoinColumn(name = "CHILD_ID")
    })
    private Child child;

    public String getGrandId() {
        return grandId;
    }

    public void setGrandId(String grandId) {
        this.grandId = grandId;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
