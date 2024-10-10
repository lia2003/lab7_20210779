package com.example.lab7_20210779.entity;
import jakarta.annotation.security.RolesAllowed;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.*;

@Getter
@Setter
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String email;
    private String password;

    @Column(nullable = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "roleId", nullable = true)
    private Roles rol;

}
