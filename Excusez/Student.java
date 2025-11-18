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

      @Override
    public ExcuseLetter createLetter(String absenceDate, String reason) {
        ExcuseLetter letter = new ExcuseLetter(absenceDate, reason, this.userId);
        System.out.println("Excuse letter created successfully!");
        System.out.println("  Letter ID: " + String.format("%04d", letter.getLetterId()));
        System.out.println("  Absence Date: " + absenceDate);
        System.out.println("  Reason: " + reason);
        return letter;
    }

     @Override
    public void submitExcuseLetter(String absenceDate, String reason) {
        ExcuseLetter letter = createLetter(absenceDate, reason);
        ExcusezSystem.addExcuseLetter(letter);
        System.out.println("Excuse letter submitted to the system!");
    }
    
    public LetterStatus trackStatus(int letterId) {
        for (ExcuseLetter letter : ExcusezSystem.getExcuseLetters()) {
            if (letter.getLetterId() == letterId && letter.getStudentId() == this.userId) {
                return letter.getStatus();
            }
        }
        return null;
    }