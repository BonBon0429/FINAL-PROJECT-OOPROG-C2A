package Excusez;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User implements Submitter {
    private int yearLevel;
    private String section;
    
    public Student(int userId, String name, String email, String password, int yearLevel, String section) {
        super(userId, name, email, password);
        this.yearLevel = yearLevel;
        this.section = section;
    }