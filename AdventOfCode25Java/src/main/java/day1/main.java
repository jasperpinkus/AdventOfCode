package main.java.day1;

import java.io.File;
import java.util.ArrayList;

public class main {

  public static void main(String[] args) {
    dial dial = new dial();
    ArrayList<String> directions = directionReader
        .readFile("docs" + File.separator + "directions");
    for (String direction : directions) {
      dial.followDirection(direction);
    }
    System.out.println(dial.getCode());
  }
}
