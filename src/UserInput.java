import java.util.Scanner;

public class UserInput {
    public static void cta() {
        System.out.println("Insert ID of your car to get information about its state.");

        Scanner $scanner = new Scanner(System.in);
        String $id = $scanner.next();
        System.out.println($id);
    }
}
