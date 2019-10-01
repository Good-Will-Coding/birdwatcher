import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String userInput;
        String quit = "quit";
        String add = "add";
        String observation = "observation";
        String statistics = "statistics";
        String show = "show";

        String birdName;
        String latinBirdName;


        Database database = new Database();

        while (true) {
            System.out.println("? ");
            userInput = reader.nextLine().toLowerCase();

            switch (userInput) {
                case add:
                    System.out.println("Name: ");
                    birdName = reader.nextLine();
                    System.out.println("Latin Name: ");
                    latinBirdName = reader.nextLine();




                case observation:
                    observation();
                case statistics:
                    statistics();
                case show:
                    show();
                case quit:
                    break;
                default:
                    System.out.println("Please enter a correct command.");

            }
        }
    }
}
