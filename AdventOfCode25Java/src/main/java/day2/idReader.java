package main.java.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class idReader {
  public static ArrayList<Long> readFile(String path) throws IllegalArgumentException {
    ArrayList<Long> ids = new ArrayList<>();
    File config = new File(path);
    Scanner scanner;
    try {
      scanner = new Scanner(config);
    } catch (
    FileNotFoundException e) {
      throw new IllegalArgumentException("File not found: " + path);
    }
    try {
      scanner.useDelimiter(",");
      while (scanner.hasNext()) {
        String scan1 = scanner.next();
        String[] range = scan1.split("-");
        for (long productId = Long.parseLong(range[0]); productId <= Long.parseLong(range[1]); productId++) {
          ids.add(productId);
        }
      }
      return ids;
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
}
