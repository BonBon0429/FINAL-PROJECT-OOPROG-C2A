package Excusez;

public interface Submitter {
    void submitExcuseLetter(String absenceDate, String reason);
    ExcuseLetter createLetter(String absenceDate, String reason);
}