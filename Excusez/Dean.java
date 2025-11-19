class Dean extends Excusez{
    private String department;
    
    public Dean(int userId, String name, String email, String password, String department) {
        super(userId, name, email, password);
        this.department = department;
    }

}