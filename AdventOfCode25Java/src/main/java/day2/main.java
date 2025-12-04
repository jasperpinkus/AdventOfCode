package main.java.day2;

import java.io.File;
import java.util.ArrayList;

public class main {
  public static void main(String[] args) {
    ArrayList<Long> ids = idReader
        .readFile("docs" + File.separator + "productIDs");
    bsFilter filter = new bsFilter();
    for (long id : ids) {
      filter.filter(id);
    }
    System.out.println(filter.getSumInvalidIDs());
  }
}
