package com.back.example.springboot.jpa.dongexample.entityOtoO;

import javax.persistence.*;

@Entity
public class Member_2 {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String username;
    @OneToOne(mappedBy = "member")
    private Locker_2 locker;

    public Locker_2 getLocker() {
        return locker;
    }

    public void setLocker(Locker_2 locker) {
        if(this.locker != null)
            this.locker.setMember(null);
        this.locker = locker;
        locker.setMember(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
