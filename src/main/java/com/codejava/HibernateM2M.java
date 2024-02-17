/*
 * package com.codejava;
 * 
 * import org.hibernate.Session; import org.hibernate.SessionFactory; import
 * org.hibernate.boot.MetadataSources; import
 * org.hibernate.boot.registry.StandardServiceRegistry; import
 * org.hibernate.boot.registry.StandardServiceRegistryBuilder;
 * 
 * public class HibernateM2M { public static void main(String[] args) {
 * StandardServiceRegistry registry=new StandardServiceRegistryBuilder()
 * .configure().build(); SessionFactory factory=new MetadataSources(registry)
 * .buildMetadata().buildSessionFactory(); Session
 * session=factory.openSession(); Group group1=new Group("Editor"); Group
 * group2=new Group("Admin");
 * 
 * User user1=new User("Jaya","Devlopment"); User user2=new
 * User("Uma","Testing"); User user3=new User("Hema","Deployment");
 * 
 * group1.addUser(user1); user1.addGroup(group1);
 * 
 * group1.addUser(user2); user2.addGroup(group1);
 * 
 * group2.addUser(user2); user2.addGroup(group2);
 * 
 * group2.addUser(user3); user3.addGroup(group2);
 * 
 * session.beginTransaction(); session.save(group1); session.save(group2);
 * session.getTransaction().commit();
 * 
 * session.clear(); factory.close(); }
 * 
 * }
 */