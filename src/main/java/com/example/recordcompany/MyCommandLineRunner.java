package com.example.recordcompany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.FileReader;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;

    public MyCommandLineRunner(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        jdbcTemplate.execute(String.valueOf(new FileReader("src/main/resources/data.sql")));
    }
}
