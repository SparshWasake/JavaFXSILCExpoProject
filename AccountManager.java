package SILCExpoProject;

import java.util.HashMap;

public class AccountManager {

    private static final HashMap<String, String> familyAccounts = new HashMap<>();
    private static final HashMap<String, String> teacherAccounts = new HashMap<>();
    private static final HashMap<String, String> studentAccounts = new HashMap<>();

    static {
        familyAccounts.put("family1", "password1");
        familyAccounts.put("family2", "password2");
        familyAccounts.put("family3", "password3");

        teacherAccounts.put("teacher1", "password1");
        teacherAccounts.put("teacher2", "password2");
        teacherAccounts.put("teacher3", "password3");

        studentAccounts.put("student1", "password1");
        studentAccounts.put("student2", "password2");
        studentAccounts.put("student3", "password3");
    }

    public static boolean login(String username, String password, String role) {
        HashMap<String, String> map = switch (role) {
            case "Family" -> familyAccounts;
            case "Teacher" -> teacherAccounts;
            case "Student" -> studentAccounts;
            default -> null;
        };

        if (map == null)
            return false;
        return map.containsKey(username) && map.get(username).equals(password);
    }

    public static boolean signUp(String username, String password, String role) {
        HashMap<String, String> map = switch (role) {
            case "Family" -> familyAccounts;
            case "Teacher" -> teacherAccounts;
            case "Student" -> studentAccounts;
            default -> null;
        };

        if (map == null)
            return false;
        if (map.containsKey(username))
            return false; // Username already exists

        map.put(username, password);
        return true;
    }
}
