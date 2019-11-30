package com.pragati.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Student
{
@Id@GeneratedValue
private int id;
private String name;

@Column(unique=true)
private int Enroll_id;
private int age;

    @JsonIgnore
    @ManyToMany(mappedBy = "stud")
    private List<Course> course=new ArrayList<Course>();

public int getId() {
        return id;
        }

public void setId(int id) {
        this.id = id;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public int getEnroll_id() {
        return Enroll_id;
        }

public void setEnroll_id(int enroll_id) {
        Enroll_id = enroll_id;
        }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Enroll_id=" + Enroll_id +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    public int getAge() {
        return age;
        }

public void setAge(int age) {
        this.age = age;
        }
}

