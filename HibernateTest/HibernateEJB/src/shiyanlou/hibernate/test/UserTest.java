package shiyanlou.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import shiyanlou.hibernate.ejb3.User;

public class UserTest {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure();
		
		SessionFactory factory = con.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		add(session);
		
		transaction.commit();
		
		session.close();
		
		factory.close();
		
	}
	
	public static void add(Session session){
		
		User user = new User();
		
		user.setId(0);
		user.setUsername("Black");
		user.setPassword("123456");
		
		session.save(user);
		
	}
	
	
}
