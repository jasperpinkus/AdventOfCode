package main.java.day3;

import java.io.File;
import java.util.ArrayList;

public class main {
  public static void main(String[] args) {
    ArrayList<String> banks = fileReader.readFile("docs" + File.separator + "joltageBanks");
    joltageCalc filter = new joltageCalc();
    for (String bank : banks) {
      filter.filter(bank);
    }
    System.out.println(filter.getSumJoltage());
  }
}
