import java.util.ArrayList;
import java.util.Scanner;

public class ExcusezSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static ArrayList<Dean> deans = new ArrayList<>();
    private static ArrayList<ExcuseLetter> excuseLetters = new ArrayList<>();
    
    public static void initializeSampleData() {
        students.add(new Student(1001, "Alice Johnson", "alice_johnson@dlsl.edu.ph", "pass1", 2, "C2A"));
        students.add(new Student(1002, "Bob Smith", "bob_smith@dlsl.edu.ph", "pass2", 3, "C3B"));
        teachers.add(new Teacher(2001, "Mr. Wilson", "wilson.tanghal@dlsl.edu.ph", "pass3", "Data Structures 1"));
        teachers.add(new Teacher(2002, "Ms. Davis", "davis.lubrico@dlsl.edu.ph", "pass4", "Object Oriented Programming"));
        deans.add(new Dean(3001, "Dr. Miller Cortez", "miller.cortez@dlsl.edu.ph", "pass5", "College of Information Technology and Engineering"));
    }
    
    public static Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getUserId() == studentId) {
                return student;
            }
        }
        return null;
    }
    
    public static void addExcuseLetter(ExcuseLetter letter) {
        excuseLetters.add(letter);
    }
    
    public static ArrayList<ExcuseLetter> getExcuseLetters() {
        return excuseLetters;
    }
    
    public static ArrayList<Student> getStudents() {
        return students;
    }
    
    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    
    public static ArrayList<Dean> getDeans() {
        return deans;
    }
    
    public static ArrayList<ExcuseLetter> getPendingLetters() {
        ArrayList<ExcuseLetter> pending = new ArrayList<>();
        for (ExcuseLetter letter : excuseLetters) {
            if (letter.getStatus() == LetterStatus.PENDING) {
                pending.add(letter);
            }
        }
        return pending;
    }