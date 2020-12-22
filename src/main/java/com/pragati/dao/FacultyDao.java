package com.pragati.dao;

import com.pragati.bean.Faculty;
import com.pragati.bean.Course;

import com.pragati.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FacultyDao {
    public static void main(String[] args)
    {
        Session session = SessionUtil.getSession();
        Transaction tx= session.beginTransaction();

        Course c1=new Course();
        c1.setC_name("MML");

        Course c2=new Course();
        c2.setC_name("Algo");

        Faculty f1=new Faculty();
        f1.setAge(35);
        f1.setName("Rishi");
        f1.setPassword("123");
        f1.setUname("priya");

        f1.getCourse().add(c1);
        f1.getCourse().add(c2);

        c1.getFac().add(f1);
        c2.getFac().add(f1);


        session.save(f1);
        session.save(c1);
        session.save(c2);
        tx.commit();
        session.close();
    }
}
