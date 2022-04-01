import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Cars {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Honda Accord 4");
    cars.add("Tesla ModelX 4");
    Collections.sort(cars, Collections.reverseOrder());  // Sort cars
    for (String i : cars) {
      System.out.println(i);
    }}}
  
