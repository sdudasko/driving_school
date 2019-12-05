package common;

import java.util.Scanner;
import java.util.UUID;

public class UserInput {
    public static UUID cta() {
        System.out.println("Insert ID of your repair to get information about its state.");

        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();

        UUID uuid = null;

        try {
            uuid = UUID.fromString(id);
        } catch (Exception e) {
            return null;
        } // TODO - logging?

        return uuid;
    }
}
