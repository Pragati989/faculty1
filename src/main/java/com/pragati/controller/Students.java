package com.pragati.controller;

import com.pragati.bean.Course;
import com.pragati.bean.Faculty;
import com.pragati.bean.Student;
import com.pragati.util.SessionUtil;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.persistence.criteria.CriteriaBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Path("/students")
public class Students {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it...login!";
    }

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public Response checkCredentials(@FormDataParam("exampleInputCourse1") int c_id) throws URISyntaxException {

        // System.out.println(""+username);
        //System.out.println("hii");


        Session session = SessionUtil.getSession();
        try {
            Transaction tx= session.beginTransaction();
            Criteria criteria=session.createCriteria(Course.class);
            CriteriaBuilder builder = session.getCriteriaBuilder();
            criteria.add(Restrictions.eq("c_Id",c_id));
            Course c=(Course) criteria.uniqueResult();
            if(c!=null)
            {
                List<Student> s= c.getStud();
                System.out.println("hii");
                return Response.seeOther(new URI("/faculty1/grades.html")).build();
                // UriBuilder builder=UriBuilder.fromPath((ne).getContextPath());
            }
            else
            {
                return Response.noContent().build();

            }
             //tx.commit();
            //session.close();


        }
        catch(HibernateException e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }

        return Response.ok().entity("Hi").build();

    }


}
