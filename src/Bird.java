import java.util.*;

public class Bird {
    private String name;
    private String latinName;
    private int count;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
      return this.name;
    }

    public String getLatinName() {
      return this.latinName;
    }

    public void increaseBirdCounter() {
      count++;
    }

    public String toString() {
      return this.name + "(" + this.latinName + "):" + this.count + " observations";
    }
}
