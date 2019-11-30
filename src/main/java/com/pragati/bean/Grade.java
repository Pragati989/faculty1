package com.pragati.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Grade {
    @Id @GeneratedValue
    private int x;
    private String enroll_id;
    private String course_id;
    private char grade;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public String getEnroll_id() {
        return enroll_id;
    }
    public void setEnroll_id(String enroll_id) {
        this.enroll_id = enroll_id;
    }
    public String getCourse_id() {
        return course_id;
    }
    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "Grade [x=" + x + ", enroll_id=" + enroll_id + ", course_id=" + course_id + ", grade=" + grade + "]";
    }

}