package com.back.example.springboot.jpa.dongexample.entityOtoO;

import javax.persistence.*;

@Entity
public class Locker_2 {
    @Id
    @GeneratedValue
    @Column(name = "LOCKER_ID")
    private Long id;

    private String name;
    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member_2 member;

    public Member_2 getMember() {
        return member;
    }

    public void setMember(Member_2 member) {
        this.member = member;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
