package com.example;

import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.example.model.Department;
import org.hibernate.Transaction;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        System.out.println("Creating the new department");

        Transaction tx = null;
        Department computerscience = new Department("computerscience");


        try(Session session = sessionFactory.openSession()){
tx = session.beginTransaction();
session.persist(computerscience);
            tx.commit();

        }
        catch(Exception ex){
            if(tx != null){
                tx.rollback();
            }
            System.out.println("currently we are not serviceable, please try again later " );
        }
System.out.println("Department is saved");
    }
}
