package com.pragati.controller;

import com.pragati.bean.Course;
import com.pragati.bean.Faculty;
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

@Path("/courses")
public class Courses {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it...login!";
    }

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public Response checkCredentials(@FormDataParam("exampleInputFaculty1") int f_id) throws URISyntaxException {

        // System.out.println(""+username);
        //System.out.println("hii");


        Session session = SessionUtil.getSession();
        try {
            Transaction tx= session.beginTransaction();
            Criteria criteria=session.createCriteria(Faculty.class);
            CriteriaBuilder builder = session.getCriteriaBuilder();
            criteria.add(Restrictions.eq("id",123));
            System.out.println("fid "+f_id);
            Faculty f=(Faculty)criteria.uniqueResult();
            System.out.println("HELLO"+f);
            if(f!=null)
            {
                    List<Course> c= f.getCourse();
                    System.out.println(c);
                    return Response.seeOther(new URI("../grades.html")).build();
                    // UriBuilder builder=UriBuilder.fromPath((ne).getContextPath());
            }
            else
            {
                return Response.noContent().build();

            }
           // tx.commit();
           // session.close();


        }
        catch(HibernateException e)
        {
            e.printStackTrace();
            System.out.println("error");
            session.getTransaction().rollback();
        }

        return Response.ok().entity("Hi").build();

    }


}
