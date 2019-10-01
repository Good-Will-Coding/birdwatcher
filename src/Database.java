import java.util.*;

public class Database {
    private ArrayList<Bird> birdList;

    public Database() {
        this.birdList = new ArrayList<Bird>();
    }

    public void addBird(Bird bird) {
        this.birdList.add(bird);
    }

    public ArrayList<Bird> getBirds() {
      return this.birdList;
    }

    public void statistics() {
      for (Bird b : birdList) {
        System.out.println(b);
      }
    }
}
