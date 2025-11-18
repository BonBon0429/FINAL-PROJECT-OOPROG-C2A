import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Excusez{
    private String subject;
    
    public Teacher(int userId, String name, String email, String password, String subject) {
        super(userId, name, email, password);
        this.subject = subject;
    }

}