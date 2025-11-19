package Excusez;
import java.util.Date;

public class ExcuseLetter {
    private static int nextId = 1001; 

    private int letterId;
    private int studentId;
    private String dateSubmitted;
    private String absenceDate;
    private String reason;
    private LetterStatus status;
    private String reviewedBy;
    private String reviewDate;
    private String comments;

    public ExcuseLetter(String absenceDate, String reason, int studentId) {
        this.letterId = nextId++;
        this.studentId = studentId;
        this.dateSubmitted = new Date().toString();
        this.absenceDate = absenceDate;
        this.reason = reason;
        this.status = LetterStatus.PENDING;
        this.reviewedBy = "";
        this.reviewDate = "";
        this.comments = "";
    }

    public void updateStatus(LetterStatus newStatus, String reviewedBy, String comments) {
        this.status = newStatus;
        this.reviewedBy = reviewedBy;
        this.reviewDate = new Date().toString();
        this.comments = comments;
    }
