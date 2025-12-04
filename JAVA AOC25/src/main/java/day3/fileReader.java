package main.java.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileReader {
  public static ArrayList<String> readFile(String path) throws IllegalArgumentException {
    ArrayList<String> joltages = new ArrayList<>();
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
        joltages.add(scanner.nextLine());
      }
      return joltages;
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
}
