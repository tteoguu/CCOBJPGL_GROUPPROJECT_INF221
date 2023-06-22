package controller;

//This class manages whether the user is logged in or not
public class LoginManager {
    private static boolean loggedIn = false;

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        LoginManager.loggedIn = loggedIn;
    }
}
