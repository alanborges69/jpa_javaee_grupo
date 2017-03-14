package br.edu.faculdadedelta.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum JPAUtil {
	
	ISNTANCE;
	
	private EntityManagerFactory factory;

	private JPAUtil() {
		factory=Persistence.createEntityManagerFactory("JpaJavaeePU");
	}
	
	public EntityManager getEntityManager(){
		return factory.createEntityManager();
	}

}
