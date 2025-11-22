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

    public static void interactiveSystem() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== EXCUSEZ SYSTEM ===");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Teacher");
            System.out.println("3. Login as Dean");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    loginAsStudent(scanner);
                    break;
                case 2:
                    loginAsTeacher(scanner);
                    break;
                case 3:
                    loginAsDean(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using Excusez System!");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
    
    private static void loginAsStudent(Scanner scanner) {
        System.out.println("\n--- STUDENT LOGIN ---");
        System.out.println("Available Students:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println((i + 1) + ". " + student.getName() + 
                             " (ID: " + String.format("%04d", student.getUserId()) + 
                             ", Year" + student.getYearLevel() + " " + student.getSection() + 
                             ", " + student.getEmail() + ")");
        }
        System.out.print("Choose student (1-" + students.size() + "): ");
        int studentChoice = scanner.nextInt() - 1;
        
        if (studentChoice >= 0 && studentChoice < students.size()) {
            students.get(studentChoice).studentMenu();
        } else {
            System.out.println("Invalid selection!");
        }
    }
    
    private static void loginAsTeacher(Scanner scanner) {
        System.out.println("\n--- TEACHER LOGIN ---");
        System.out.println("Available Teachers:");
        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            System.out.println((i + 1) + ". " + teacher.getName() + 
                             " (ID: " + String.format("%04d", teacher.getUserId()) + 
                             ", " + teacher.getSubject() + 
                             ", " + teacher.getEmail() + ")");
        }
        System.out.print("Choose teacher (1-" + teachers.size() + "): ");
        int teacherChoice = scanner.nextInt() - 1;
        
        if (teacherChoice >= 0 && teacherChoice < teachers.size()) {
            teachers.get(teacherChoice).teacherMenu();
        } else {
            System.out.println("Invalid selection!");
        }
    }
    
    private static void loginAsDean(Scanner scanner) {
        System.out.println("\n--- DEAN LOGIN ---");
        System.out.println("Available Deans:");
        for (int i = 0; i < deans.size(); i++) {
            Dean dean = deans.get(i);
            System.out.println((i + 1) + ". " + dean.getName() + 
                             " (ID: " + String.format("%04d", dean.getUserId()) + 
                             ", " + dean.getDepartment() + 
                             ", " + dean.getEmail() + ")");
        }
        System.out.print("Choose dean (1-" + deans.size() + "): ");
        int deanChoice = scanner.nextInt() - 1;
        
        if (deanChoice >= 0 && deanChoice < deans.size()) {
            deans.get(deanChoice).deanMenu();
        } else {
            System.out.println("Invalid selection!");
        }
    }
}