package com.example.e_learning.Model;

public class BookClass {
    private int ClassImage;
    private String ClassSubject,ClassName,ClassTime;

    public BookClass(int classImage, String classSubject, String className, String classTime) {
        ClassImage = classImage;
        ClassSubject = classSubject;
        ClassName = className;
        ClassTime = classTime;
    }

    public int getClassImage() {
        return ClassImage;
    }

    public void setClassImage(int classImage) {
        ClassImage = classImage;
    }

    public String getClassSubject() {
        return ClassSubject;
    }

    public void setClassSubject(String classSubject) {
        ClassSubject = classSubject;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getClassTime() {
        return ClassTime;
    }

    public void setClassTime(String classTime) {
        ClassTime = classTime;
    }
}
