package lecture_3.interfaces;

public class MobileBank implements Accounts {

    private String loggedInUser = null;

    @Override
    public void personRegistration(String firstName, String lastName, String email, String password) {
        if (firstName == null || lastName == null || email == null || password == null) {
            System.out.println("MobileBank: Please fill in all fields.");
        } else {
            System.out.println("MobileBank: Registered " + firstName + " " + lastName);
        }
    }

    @Override
    public void personLogin(String email, String password) {
        if (email == null || password == null) {
            System.out.println("MobileBank: Email and password are required.");
        } else {
            loggedInUser = email;
            System.out.println("MobileBank: " + email + " logged in.");
        }
    }

    @Override
    public void personLogout() {
        System.out.println("MobileBank: " + loggedInUser + " logged out.");
        loggedInUser = null;
    }

    @Override
    public void personProfile() {
        System.out.println("MobileBank: Showing profile for " + loggedInUser);
    }

    @Override
    public void updatePersonEmail(String email) {
        System.out.println("MobileBank: Email updated to " + email);
        loggedInUser = email;
    }
}
