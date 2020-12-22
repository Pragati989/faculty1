package com.pragati.controller;


import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import javax.management.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;


import com.pragati.bean.Faculty;
import com.pragati.util.SessionUtil;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

@Path("/login")
public class Login {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it...login!";
    }

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public Response checkCredentials(@FormDataParam("exampleInputEmail1") String username, @FormDataParam("exampleInputPassword1") String password
    ) throws URISyntaxException{

        System.out.println("hii");
        Session session = SessionUtil.getSession();
        try {
            Transaction tx= session.beginTransaction();
            Criteria criteria=session.createCriteria(Faculty.class);
            CriteriaBuilder builder = session.getCriteriaBuilder();
            criteria.add(Restrictions.eq("uname",username));


            Faculty f=(Faculty)criteria.uniqueResult();
            if(f!=null)
            {

                System.out.println(f.getUname());
                System.out.println(f.getPassword());
                if(f.getPassword().equals(password)) {
                    System.out.println("hii");
                    //return Response.ok().entity(200).build();
                    //return Response.seeOther(new URI("../facultyhomepage.html")).build();
                    return Response.ok().entity("SUCCESS").build();
                   }

                else
                {
                    //return Response.seeOther(new URI("../index.html")).build();
                    return Response.ok().entity("FAILURE").build();
                    //return Response.noContent().build();
                }
            }
            else
            {
                //return Response.seeOther(new URI("../index.html")).build();
                return Response.ok().entity("FAILURE").build();
                //return Response.noContent().build();

            }
           // tx.commit();
           // session.close();


        }
        catch(HibernateException e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }

        return Response.ok().entity("Hi").build();

    }


}