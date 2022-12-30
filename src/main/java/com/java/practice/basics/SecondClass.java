package com.java.practice.basics;

public class SecondClass {
    int rollNo;
    String name;
    String section;


    @Override
    public String toString() {
        return "SecondClass{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    SecondClass(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
        this.section = "7c";
    }

    public void setterRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public void setterName(String name){
        this.name = name;
    }

    public int getterRollNo(){
        return rollNo;
    }

    public String getterName(){
        return name;
    }

}