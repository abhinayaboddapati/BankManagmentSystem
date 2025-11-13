package com.Bank.Config;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class Bank_Config 
{
	@Bean
	public Scanner scannerClassBean()
	{
		return new Scanner(System.in);
		
	}
	@Bean
	public EntityManagerFactory entityManagerFactoryBean() {
		return Persistence.createEntityManagerFactory("Bank_Mnagment_System_Using_Hibernate_And_SpringCore");
	}
	@Bean
	public EntityManager entityManagerBean(EntityManagerFactory factory) {
		return entityManagerFactoryBean().createEntityManager();
	}
	@Bean
	public EntityTransaction entityTransactionBean(EntityManager manager) {
		return  manager.getTransaction();
	}
	}

