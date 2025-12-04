package main.java.day2;

import java.util.ArrayList;

public class bsFilter {
  private long sumInvalidIDs = 0;

  public void filter(long id) {
    if (!validHelper2(id)) {
      return;
    }
    sumInvalidIDs += id;
  }

  private boolean validHelper(long id) {
    String idStr = String.valueOf(id);
    int halfIndex = idStr.length() / 2;
    String firstHalf = idStr.substring(0, halfIndex);
    String secondHalf = idStr.substring(halfIndex);
    return !firstHalf.equals(secondHalf);
  }

  private boolean validHelper2(long id) {
    String idStr = String.valueOf(id);
    outerLoop:
    for (int split = 2; split <= idStr.length(); split++) {
      ArrayList<String> chunks = new ArrayList<>();
      int totalLength = idStr.length();
      int basePartLength = totalLength / split;
      int remainder = totalLength % split;
      int startIndex = 0;

      if (remainder != 0) {
        continue;
      }
      for (int index = 0; index < split; index++) {
        int endIndex = startIndex + basePartLength;
        chunks.add(idStr.substring(startIndex, endIndex));
        startIndex = endIndex;
      }
      String firstChunk = chunks.getFirst();
      for (String chunk : chunks) {
        if (chunk.equals(firstChunk)) {
          continue;
        }
        continue outerLoop;
      }
      return true;
    }
    return false;
  }

  public long getSumInvalidIDs() {
    return sumInvalidIDs;
  }
}
