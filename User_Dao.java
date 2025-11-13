package com.Bank.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import com.Bank.Entity.User_Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class User_Dao {
	@Autowired
	EntityManagerFactory entityManagerFactory;
	@Autowired
	EntityManager entityManager;
	@Autowired
	EntityTransaction entityTransaction;
	public void insertUserDetails(User_Information userInformation) {
		entityTransaction.begin();
		entityManager.persist(userInformation);
		entityTransaction.commit();
	}
}




