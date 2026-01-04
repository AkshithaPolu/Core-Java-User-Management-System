package UserManagementSystem.src;

public class MainApp {

    public static void main(String[] args) {

        UserService service = new UserService(5);

        try {
            User u1 = new User("Akshitha", "akshi@gmail.com", Role.ADMIN, true);
            User u2 = new User("Snehitha", "snehitha@gmail.com", Role.USER, true);
            User u3 = new User("Akshaya", "akshi@gmail.com", Role.USER, false); // duplicate email

            service.addUser(u1);
            service.addUser(u2);
            service.addUser(u3); 
        }
        catch (DuplicateUserException e) {
            System.out.println("Error: " + e.getMessage());
        }

        service.displayUsers();
    }   
}