package UserManagementSystem.src;

public class User {

    private static int idCounter = 100;

    private int id;
    private String name;
    private String email;
    private Role role;
    private boolean active;

    public User(String name, String email, Role role, boolean active) {
        this.id = ++idCounter;  
        this.name = name;
        this.email = email;
        this.role = role;
        this.active = active;
    }

     public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        return this.email !=null && this.equals(other.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public String toString() {
        return "User [ID=" + id + ", Name=" + name +  ", Email=" + email +  ", Role=" + role + ", Active=" + active + "]";
    }
}