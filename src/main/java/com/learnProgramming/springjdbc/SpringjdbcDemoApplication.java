package com.learnProgramming.springjdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learnProgramming.springjdbctojpa.entity.Person;
import com.learnProgramming.springjdbctojpa.jdbc.PersonJdbcDao;


@SpringBootApplication
public class SpringjdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All users -> {} " ,personJdbcDao.findAll());
		logger.info("finding user by id -> {}" , personJdbcDao.findById(100));
		logger.info("Deleting the user by id no of rows affected -> {}", personJdbcDao.deleteById(100));
		logger.info("inserting 104 -> {}",  personJdbcDao.insert(new Person(103,"Geethu","slc",new Date())));
		logger.info("updating 103 -> {}", personJdbcDao.update(new Person(101,"Jayappa","slc",new Date())));
		
	}

}
