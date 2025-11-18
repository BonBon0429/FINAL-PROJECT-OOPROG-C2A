package Excusez;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Excusez{
private String subject;

public Teacher(int userId, String name, String email, String password, String subject) {
super(userId, name, email, password);
this.subject = subject;
}

public ArrayList<ExcuseLetter> reviewLetters() {
ArrayList<ExcuseLetter> pendingLetters = new ArrayList<>();
for (ExcuseLetter letter : Excusez.excuseLetters) {
if (letter.getStatus() == LetterStatus.PENDING) {
pendingLetters.add(letter);
}
}
return pendingLetters;
}
public void rejectLetter(int letterId, String comments) {
for (ExcuseLetter letter : Excusez.excuseLetters) {
if (letter.getLetterId() == letterId) {
letter.updateStatus(LetterStatus.REJECTED, this.name, comments);
System.out.println("✓ Letter " + String.format("%04d", letterId) + " rejected.");
return;
}
}
System.out.println("Letter not found!");
}

@Override
public ArrayList<ExcuseLetter> viewExcuseHistory() {
return new ArrayList<>(Excusez.excuseLetters);
}
}

//Getter
public String getSubject() { return subject; }

public void teacherMenu() {
Scanner scanner = new Scanner(System.in);
while (true) {
System.out.println("\n=== TEACHER MENU ===");
System.out.println("Welcome, " + name + "! (ID: " + String.format("%04d", userId) + ")");
System.out.println("Subject: " + subject);
System.out.println("1. Review Pending Letters");
System.out.println("2. Reject Letter");
System.out.println("3. View All Letters");
System.out.println("4. Logout");
System.out.print("Choose an option: ");

int choice = scanner.nextInt();
scanner.nextLine();
