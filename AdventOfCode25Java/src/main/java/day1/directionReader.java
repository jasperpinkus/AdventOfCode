package main.java.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class directionReader {
  public static ArrayList<String> readFile(String path) throws IllegalArgumentException {
    ArrayList<String> directions = new ArrayList<>();
    File config = new File(path);
    Scanner scanner;
    try {
      scanner = new Scanner(config);
    } catch (
    FileNotFoundException e) {
      throw new IllegalArgumentException("File not found: " + path);
    }
    try {
      while (scanner.hasNextLine()) {
        directions.add(scanner.nextLine());
      }
      return directions;
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
}
