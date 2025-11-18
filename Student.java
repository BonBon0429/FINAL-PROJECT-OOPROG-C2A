import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

enum LetterStatus {
    PENDING, APPROVED, REJECTED
}

interface Submitter {
    void submitExcuseLetter(String absenceDate, String reason);
    ExcuseLetter createLetter(String absenceDate, String reason);
}

