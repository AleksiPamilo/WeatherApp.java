import java.util.Scanner;

public class InputHandler {
    public static String kysyKaupunki() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna kaupungin nimi: ");
        return sc.nextLine();
    }
}
