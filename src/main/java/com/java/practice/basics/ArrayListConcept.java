package com.java.practice.basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {
    public static void main(String[] args) {
        SecondClass obj1 = new SecondClass(24, "Pavi");
//        SecondClass obj2 = new SecondClass(27, "Karthick");
//        SecondClass obj3 = new SecondClass(1, "Prakriti");

//        SecondClass obj4 = new SecondClass(1, "Dhanush", "8c");
//        SecondClass obj = new SecondClass();
//        obj.setterName("Abc");
//        System.out.println(obj.getterName());
//        System.out.println(obj.getterMethod());
//        System.out.println("----");
//
//        obj.setterMethod(5);
//        System.out.println(obj.rollNo);

        List<SecondClass> arrayList = new ArrayList<>();
        arrayList.add(obj1);
//        arrayList.add(obj2);
//        arrayList.add(obj3);
//        arrayList.add(obj4);
////
        System.out.println(arrayList.get(0));   // returns object memory location
//
////        obj1.setterName("Pavi");
//        arrayList.get(0).setterName("Pavithra");
//        System.out.println(arrayList.get(0).getterName());
////        System.out.println(new Sdh(1,"Pavi","Abi").);

//        System.out.println(arrayList.get(0).toString());



    }
}

