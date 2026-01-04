package UserManagementSystem.src;

public class UserService {
    private User[] users; 
    private int count = 0;

    public UserService(int size) {
        users = new User[size];
    }

    public void addUser(User user) throws DuplicateUserException {

        if (user == null || user.getEmail() == null) {
            System.out.println("Invalid User Data");
            return;
        }
        if (isDuplicateEmail(user.getEmail())) {
            throw new DuplicateUserException("Email already exists");
        }

        if (count >= users.length) {
            System.out.println("User storage full");
            return;
        }

        users[count++] = user;
        System.out.println("User added successfully");
    }

    private boolean isDuplicateEmail(String email) {
        for (int i = 0; i < count; i++) {
            if (users[i].getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public void displayUsers() {
        System.out.println("\n--- Users List ---");
        for (int i = 0; i < count; i++) {
            System.out.println(users[i]);
        }
    }  
}