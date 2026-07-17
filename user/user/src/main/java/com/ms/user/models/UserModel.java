package com.ms.user.models;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;


@Table(name = "TB_USERS")
@Entity
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private UUID userId;

    @Column(nullable = false, length =  150, unique = true)
    private String name;

    @Column(nullable = false, length = 150)
    private Integer age;

    @Column(nullable = false, length = 100)
    private String email;


    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
