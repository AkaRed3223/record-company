package com.example.recordcompany.domain;

import jakarta.persistence.*;
import org.springframework.data.relational.core.mapping.Table;

@Entity(name = "albums")
@Table(name = "albums")
public class Album {

    @Id
    @SequenceGenerator(
            name = "album_id",
            sequenceName = "album_id",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "album_id"
    )
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private int release_year;

    @ManyToOne
    @JoinColumn(name = "band_id", referencedColumnName = "id", nullable = false)
    private Band band;

    public Album() {
    }

    public Album(String name, int release_year) {
        this.name = name;
        this.release_year = release_year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public int getBand() {
        return band.getId();
    }
}
