package in.co.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import in.co.Util.HiberUtil;
import in.co.hibernate.User;

public class TestCRUD {

	public static void main(String[] args) throws Exception {
		
		   testAdd();
		   //testDelete();
		   //testUpdate();
		   //testGet();
		   //testUpdateSingleCloumn();

	}

	public static void testUpdateSingleCloumn() throws Exception {
		SessionFactory sf = HiberUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx =null;
		
		tx = s.beginTransaction();
		int id = 1;
		String newName = "Ramesh";
		String hqlUpdate = "update User u set u.firstName = :newName where u.id = :id"; 
		// or String hqlUpdate = "update Customer set name = :newName where name = :oldName"; 
		int updatedEntities = s.createQuery( hqlUpdate )
				.setParameter( "newName", newName )
				.setParameter("id", id ).executeUpdate(); 
		tx.commit();
		s.close();
		HiberUtil.shutdown();
		
	}

	public static void testGet() throws Exception {
		SessionFactory sf = HiberUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx =null;
		
		tx = s.beginTransaction();
		
		User u =(User) s.get(User.class, 1);
		System.out.println(u.getId());
		System.out.println(u.getFirstName());
		System.out.println(u.getLastName());
		System.out.println(u.getUserName());
		System.out.println(u.getPassword());
		s.close();
		HiberUtil.shutdown();
		
		
	}

	public static void testUpdate() throws Exception {
		SessionFactory sf = HiberUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx =null;
		
		tx = s.beginTransaction();
		
		User u =new User();
		
		u.setId(2);
		u.setFirstName("ankit");
		u.setLastName("gohar");
		u.setUserName("ag.gohar");
		u.setPassword("1234567");
		
		s.update(u);
	    tx.commit();
		System.out.println("update");
		s.close();
		HiberUtil.shutdown();
		
	}

	public static void testDelete() throws Exception {
		
		SessionFactory sf = HiberUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx =null;
		
		tx = s.beginTransaction();
		
		User u = new User();
		u.setId(3);
		
		s.delete(u);
		tx.commit();
		System.out.println("delete");
		s.close();
		HiberUtil.shutdown();
			
	}
	

	public static void testAdd() throws Exception {
		
		SessionFactory sf = HiberUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx =null;
		
		tx = s.beginTransaction();
		
		User u = new User();
		
		u.setFirstName("niraj");
		u.setLastName("vyas");
		u.setUserName("nv.vyas");
		u.setPassword("5066");
		
		s.save(u);
		tx.commit();
		System.out.println("inserted");
		s.close();
		HiberUtil.shutdown();
	}	
}		
		
		
		
		
	
	


