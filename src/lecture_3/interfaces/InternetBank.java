package lecture_3.interfaces;

public class InternetBank implements Accounts {

    private String loggedInUser = null;

    @Override
    public void personRegistration(String firstName, String lastName, String email, String password) {
        System.out.println("InternetBank: Registered " + firstName + " " + lastName + " (" + email + ")");
    }

    @Override
    public void personLogin(String email, String password) {
        loggedInUser = email;
        System.out.println("InternetBank: " + email + " logged in.");
    }

    @Override
    public void personLogout() {
        System.out.println("InternetBank: " + loggedInUser + " logged out.");
        loggedInUser = null;
    }

    @Override
    public void personProfile() {
        System.out.println("InternetBank: Showing profile for " + loggedInUser);
    }

    @Override
    public void updatePersonEmail(String email) {
        System.out.println("InternetBank: Email updated to " + email);
        loggedInUser = email;
    }
}
