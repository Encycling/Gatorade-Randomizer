import java.util.Random;
import java.util.Scanner;

public class Main {
    static String restart = "";

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        do {
            restart = "";
            Flavors();
            System.out.println("Would you like to get another flavor? (y/n)");
            restart = scanner.nextLine();
        } while (restart.equalsIgnoreCase("y"));

        scanner.close();
    }

    public static void Flavors() {
        Random random = new Random();
        int holder = 10;
        int rnd = random.nextInt(holder);

        switch (rnd) {
            case 1:
                System.out.println("Your falvor is lemon lime.");
                break;

            case 2:
                System.out.println("Your flavor is fruit punch");
                break;

            case 3:
                System.out.println("Your flavor is orange");
                break;

            case 4:
                System.out.println("Your flavor is riptide rush");
                break;

            case 5:
                System.out.println("Your flavor is cool blue");
                break;

            case 6:
                System.out.println("Your flavor is frost glacier freeze");
                break;

            case 7:
                System.out.println("Your flavor is frost glacier cherry");
                break;

            case 8:
                System.out.println("Your flavor is fierce green apple");
                break;

            case 9:
                System.out.println("Your flavor is lime cubcumber.");
                break;

            case 10:
                System.out.println("Your flavor is frost icy charge.");
                break;

        }
    }
}
