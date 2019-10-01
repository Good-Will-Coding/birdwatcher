import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    final String quit = "quit";
    final String add = "add";
    final String observation = "observation";
    final String statistics = "statistics";
    final String show = "show";

    String userInput;

    Database database = new Database();

    while (true) {
      System.out.println("? ");
      userInput = reader.nextLine().toLowerCase();

      switch (userInput) {
      case add:
        addBird(reader, database);
        break;
      case observation:
        observeBird(reader, database);
        break;
      case statistics:
        database.statistics();
        break;
      case show:
        showBird(reader, database);
        break;
      case quit:
        break;
      default:
        System.out.println("Restart and please enter a correct command.");
      }
    }
  }

  public static void addBird(Scanner reader, Database database) {
    System.out.println("Name: ");
    String birdName = reader.nextLine();
    System.out.println("Latin Name: ");
    String latinBirdName = reader.nextLine();

    database.addBird(new Bird(birdName, latinBirdName));
  }

  public static void observeBird(Scanner reader, Database database) {
    System.out.println("What was observed? ");
    String birdName = reader.nextLine();

    for (Bird b : database.getBirds()) {
      if (b.getName().equalsIgnoreCase(birdName) || b.getLatinName().equalsIgnoreCase(birdName)) {
        b.increaseBirdCounter();
        return;
      }
    }
    System.out.println("Is not a bird!");
  }

  public static void showBird(Scanner reader, Database database) {
    System.out.println("What bird? ");
    String bird = reader.nextLine();

    for (Bird b : database.getBirds()) {
      if (b.getName().equalsIgnoreCase(bird) || b.getLatinName().equalsIgnoreCase(bird)) {
        System.out.println(b);
        return;
      }
    }
    System.out.println("Is not a bird!");
  }
}
