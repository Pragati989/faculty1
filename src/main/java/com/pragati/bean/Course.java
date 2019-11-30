package com.pragati.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

        @Id@GeneratedValue
        int c_Id;
        String c_name;

        @JsonIgnore
        @ManyToMany
        private List<Faculty> fac=new ArrayList<Faculty>();

        @ManyToMany
        private List<Student> stud=new ArrayList<Student>();

        public int getC_Id() {
            return c_Id;
        }

        public void setC_Id(int c_Id) {
            this.c_Id = c_Id;
        }

        public String getC_name() {
            return c_name;
        }

        public void setC_name(String c_name) {
            this.c_name = c_name;
        }

         public List<Faculty> getFac() {
        return fac;
         }
         public void setFac(List<Faculty> fac) {
         this.fac = fac;
          }

    public List<Student> getStud() {
        return stud;
    }

    public void setStud(List<Student> stud) {
        this.stud = stud;
    }

    @Override
    public String toString() {
        return "Course{" +
                "c_Id=" + c_Id +
                ", c_name='" + c_name + '\'' +
                ", fac=" + fac +
                ", stud=" + stud +
                '}';
    }
}


