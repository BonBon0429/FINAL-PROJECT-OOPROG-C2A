package Excusez;

import java.util.ArrayList;

public abstract class User {
    protected int userId;
    protected String name;
    protected String email;
    protected String password;
    
    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

  public boolean login(String username, String password) {
        return this.email.equals(username) && this.password.equals(password);
    }
    
    public void logout() {
        System.out.println(name + " logged out.");
    }    