package com.pragati.dao;

import com.pragati.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoginDao {
    public static void main(String[] args)
    {
        Session session = SessionUtil.getSession();
        Transaction tx= session.beginTransaction();
        //Faculty f1=session.get(Faculty.class,);
    }
}
