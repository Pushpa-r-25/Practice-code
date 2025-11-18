package com.example.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// helper class for session factory
public class HibernateUtil {
    // single factory boss
    private static final SessionFactory sessionFactory = buildSessionFactory();
   private static SessionFactory buildSessionFactory() {
       try{
           return new Configuration().configure().buildSessionFactory();
       }
       catch(Throwable ex) { // its like superclass for all exception
           System.err.println("Initial SessionFactory creation failed." + ex);
           throw new ExceptionInInitializerError(ex);
       }

   }

    public static SessionFactory getSessionFactory() {
       return sessionFactory;
    }
}
