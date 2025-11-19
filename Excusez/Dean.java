class Dean extends Excusez{
    private String department;
    
    public Dean(int userId, String name, String email, String password, String department) {
        super(userId, name, email, password);
        this.department = department;
    }
public void approveLetter(int letterId) {
        for (ExcuseLetter letter : Excusez.excuseLetters) {
            if (letter.getLetterId() == letterId) {
                letter.updateStatus(LetterStatus.APPROVED, this.name, "Approved by Dean");
                System.out.println("✓ Letter " + String.format("%04d", letterId) + " approved by Dean.");
                return;
            }
        }
        System.out.println("Letter not found!");
    }

}