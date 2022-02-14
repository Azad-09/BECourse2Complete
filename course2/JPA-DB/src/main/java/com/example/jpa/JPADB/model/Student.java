package com.example.jpa.JPADB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private String ID;
//    @Column(name = "Name")
    private String name;
//    @Column(name = "Mark")
    private int mark;

    public Student() {
    }

    public Student(String ID, String name, int mark) {
        this.ID = ID;
        this.name = name;
        this.mark = mark;
    }

    public String  getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
