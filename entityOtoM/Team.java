package com.back.example.springboot.jpa.dongexample.entityOtoO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;
    @OneToMany
    @JoinColumn(name="TEAM_ID") // Member 테이블의 TEAM_ID와 매핑
    private List<Member> members = new ArrayList<Member>();

    public Team(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void addMembers(Member member){
        this.members.add(member);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
