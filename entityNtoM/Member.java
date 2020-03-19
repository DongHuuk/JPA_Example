package com.back.example.springboot.jpa.dongexample.entityNtoM;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String username;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

//    @ManyToMany
//    @JoinTable(
//            name = "MEMBER_PRODUCT",
//            joinColumns = @JoinColumn(name = "MEMBER_ID"),
//            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID")
//    )
//    private List<Product> productList = new ArrayList<>();
//
//    public List<Product> getProductList() {
//        return productList;
//    }
//
//    public void addProductList(Product productList) {
//        this.productList.add(productList);
//        productList.getMembers().add(this);
//    }

//    @OneToMany(mappedBy = "member")
//    private List<MemberProduct> memberProducts = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order order) {
        this.orders.add(order);
    }

//    private void addMemberProducts(MemberProduct memberProduct) {
//        this.memberProducts.add(memberProduct);
//    }
//
//    public List<MemberProduct> getMemberProducts() {
//        return memberProducts;
//    }

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

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", orders=" + orders +
                '}';
    }
}
