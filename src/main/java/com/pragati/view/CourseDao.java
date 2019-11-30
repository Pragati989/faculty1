package com.pragati.view;

import com.pragati.bean.Course;
import com.pragati.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CourseDao {
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Session session = SessionUtil.getSession();
        Course c=new Course();
        c.setC_name("astha");
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
    }
}
