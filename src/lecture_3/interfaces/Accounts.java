package lecture_3.interfaces;

public interface Accounts {

    // Default method — shared behavior available to all implementors without overriding
    default void showWelcomeMessage() {
        System.out.println("Welcome to our banking system!");
    }

    void personRegistration(String firstName, String lastName, String email, String password);

    void personLogin(String email, String password);

    void personLogout();

    void personProfile();

    void updatePersonEmail(String email);
}
