package com.tmgreyhat.crud.models;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    @NotNull
    @Size(min=3, max=255)
    private String firstName;

    @Column(name = "last_name")
    @NotNull
    @Size(min = 3, max = 255)
    private String lastName;

    @Column(name = "email")
    @NotNull
    @Size(min = 3, max = 255)
    private String email;




}
