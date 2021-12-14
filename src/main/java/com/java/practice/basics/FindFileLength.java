package com.java.practice.basics;

import java.io.File;

public class FindFileLength {
    public static void main(String[] args) {
        System.out.println(new File("D:/Books/Atomic Habits/Atomic Habits by James Clear.epub").length() + " bytes");
    }
}
