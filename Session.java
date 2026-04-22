package SILCExpoProject;

public class Session {
    private static String currentRole;

    public static void setCurrentRole(String role) {
        currentRole = role;
    }

    public static String getCurrentRole() {
        return currentRole;
    }
}
