package com.pragati;

import com.pragati.bean.Course;
//import com.pragati.util.SessionUtil
import com.pragati.bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Configuration configuration=new Configuration().configure().addAnnotatedClass(Course.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Course c=new Course();
        c.setC_name("abc");
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
    }
}
