package net.youtics.springboot.webapp.springbootweb.models;

public class User {

    private String name;
    private String lastName;
    private String email;
    private String username;

    public User(String name, String lastName, String email, String username) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
   
    

    

}
