package com.example.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
@Table(name="departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

//    create defalut constructor

    public Department() {
    }
//    constructor with parameter
    public Department(String name) {
        this.name = name;
    }

//    inherited by default
    @Override
    public String toString() {
        return String.format( "Department{id=%d, name='%s'}", id, name );
    }

//    getter and setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
