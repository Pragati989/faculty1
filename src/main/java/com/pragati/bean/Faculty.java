package com.pragati.bean;

import sun.rmi.log.LogInputStream;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Faculty {

    @Id@GeneratedValue
    private int id;
    @Column(unique=true)
    private String uname;
    private String password;
    private int age;
    private String name;

    @ManyToMany(mappedBy = "fac")
    private List<Course> course=new ArrayList<Course>();
    public int getId() {
        return id;
    }
    /*public void setId(int id) {
        this.id = id;
    }*/
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
