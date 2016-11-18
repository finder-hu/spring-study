package com.finder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringStudyApplication implements CommandLineRunner {

	@SuppressWarnings("SpringJavaAutowiringInspection")
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringStudyApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		String name = jdbcTemplate.queryForObject
				("select name from test where idtest = 2",String.class);
		System.out.println("name:" + name);
	}
}
