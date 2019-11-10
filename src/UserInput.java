import java.util.Scanner;
import java.util.UUID;

public class UserInput {
    public static UUID cta() {
        System.out.println("Insert ID of your car to get information about its state.");

        Scanner $scanner = new Scanner(System.in);
        String $id = $scanner.next();
        UUID $uuid = UUID.fromString($id);

        return $uuid;
    }
}
