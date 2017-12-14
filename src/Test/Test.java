package Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	

	public static void main(String[] args) 
	{
		emf=Persistence.createEntityManagerFactory("myMySQLBase");
		emf.close();
	}
	
//	public static void main(String[] args) 
//	{
//		debutTest();
//		finTest();
//	}
	
//	public static void debutTest() 
//	{
//		emf = Persistence.createEntityManagerFactory("jpa");
//		em = emf.createEntityManager();
//	}
//	
//	public static void finTest()
//	{
//		em.close();
//		emf.close();
//	}
}
