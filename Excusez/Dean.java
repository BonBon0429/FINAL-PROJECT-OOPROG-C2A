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
public void rejectLetter(int letterId, String comments) {
        for (ExcuseLetter letter : Excusez.excuseLetters) {
            if (letter.getLetterId() == letterId) {
                letter.updateStatus(LetterStatus.REJECTED, this.name, comments);
                System.out.println("✓ Letter " + String.format("%04d", letterId) + " rejected by Dean.");
                return;
            }
        }
        System.out.println("Letter not found!");
    }
@Override
    public ArrayList<ExcuseLetter> viewExcuseHistory() {
        return new ArrayList<>(Excusez.excuseLetters);
    }

public String getDepartment() { return department; }
    
    public void deanMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== DEAN MENU ===");
            System.out.println("Welcome, " + name + "! (ID: " + String.format("%04d", userId) + ")");
            System.out.println("Department: " + department);
            System.out.println("1. View All Letters");
            System.out.println("2. Approve Letter");
            System.out.println("3. Reject Letter");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
switch (choice) {
                case 1:
                    ArrayList<ExcuseLetter> allLetters = viewExcuseHistory();
                    if (allLetters.isEmpty()) {
                        System.out.println("No letters found.");
                    } else {
                        System.out.println("\n--- ALL LETTERS ---");
                        for (ExcuseLetter letter : allLetters) {
                            Student student = Excusez.findStudentById(letter.getStudentId());
                            String studentInfo = student != null ? 
                                student.getName() + " (Y" + student.getYearLevel() + "-" + student.getSection() + ")" : 
                                "Unknown Student";
                                
                            System.out.println("ID: " + String.format("%04d", letter.getLetterId()) + 
                                             " | Student: " + studentInfo +
                                             " | Status: " + letter.getStatus() +
                                             " | Date: " + letter.getAbsenceDate() +
                                             " | Reviewed by: " + letter.getReviewedBy());
                        }
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter letter ID to approve: ");
                    int approveId = scanner.nextInt();
                    scanner.nextLine();
                    approveLetter(approveId);
                    break;
                    
                case 3:
                    System.out.print("Enter letter ID to reject: ");
                    int rejectId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter rejection reason: ");
                    String reason = scanner.nextLine();
                    rejectLetter(rejectId, reason);
                    break;
                    
              
                    
                case 4:
                    logout();
                    return;
                    
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

}