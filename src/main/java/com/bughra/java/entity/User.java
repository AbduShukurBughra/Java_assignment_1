package com.bughra.java.entity;


import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "Users")
@Data

public class User extends BaseEntity{

    @Id
    @GeneratedValue(generator = "user", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user", sequenceName = "USER_ID_SEQ", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;

    @Column(name="PASSWORD", nullable = false, length = 50)
    private String password;

}
