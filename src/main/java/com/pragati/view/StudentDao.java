package com.pragati.view;

import com.pragati.bean.Course;
import com.pragati.bean.Faculty;
import com.pragati.bean.Student;
import com.pragati.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {
    public static void main(String[] args)
    {
        Session session = SessionUtil.getSession();
        Transaction tx= session.beginTransaction();

        Course c1=new Course();
        c1.setC_name("MML");

        Course c2=new Course();
        c2.setC_name("Algo");

        Student s1=new Student();
        s1.setAge(35);
        s1.setName("Rachna");
        s1.setEnroll_id(30);


        s1.getCourse().add(c1);
        s1.getCourse().add(c2);
        c1.getStud().add(s1);
        c2.getStud().add(s1);


        session.save(s1);
        session.save(c1);
        session.save(c2);
        tx.commit();
        session.close();
    }
}
