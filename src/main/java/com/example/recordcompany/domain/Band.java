package com.example.recordcompany.domain;

import jakarta.persistence.*;
import org.springframework.data.relational.core.mapping.Table;

@Entity(name = "bands")
@Table(name = "bands")
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    public Band() {
    }

    public Band(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
