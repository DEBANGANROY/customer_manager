package com.crm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "customer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id;
    @Column(name="first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name="email")
    private String email;
}
