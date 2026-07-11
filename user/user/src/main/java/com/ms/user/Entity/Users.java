package com.ms.user.Entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;


@Table(name = "TB_USERS")
@Entity
class Users implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private UUID userId;

    @Column(nullable = false, length =  150, unique = true)
    private String name;

    @Column(nullable = false, length = 150)
    private Integer age;

}
