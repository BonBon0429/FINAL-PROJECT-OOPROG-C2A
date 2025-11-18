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
}