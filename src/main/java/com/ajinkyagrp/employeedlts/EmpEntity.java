package com.ajinkyagrp.employeedlts;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="emp_db")
public class EmpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
}