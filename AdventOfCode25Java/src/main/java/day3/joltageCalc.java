package main.java.day3;

public class joltageCalc {
  private long sumJoltage = 0;

  public void filter(String bank) {
    int maxFirst = 0;
    int firstIndex = 0;
    int maxSecond = 0;
    int secondIndex = 0;
    int maxThird = 0;
    int thirdIndex = 0;
    int maxFourth = 0;
    int fourthIndex = 0;
    int maxFifth = 0;
    int fifthIndex = 0;
    int maxSixth = 0;
    int sixthIndex = 0;
    int maxSeventh = 0;
    int seventhIndex = 0;
    int maxEighth = 0;
    int eighthIndex = 0;
    int maxNinth = 0;
    int ninthIndex = 0;
    int maxTenth = 0;
    int tenthIndex = 0;
    int maxEleventh = 0;
    int eleventhIndex = 0;
    int maxTwelfth = 0;

    for (int i = 0; i < bank.length() - 11; i++) {
      char c = bank.charAt(i);
      if (Character.isDigit(c)) {
        if (Integer.parseInt(c + "") > maxFirst) {
          maxFirst = Integer.parseInt(c + "");
          firstIndex = bank.indexOf(c);
        }
      }
    }
    for (int i = firstIndex + 1; i < bank.length() - 10; i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int secondInt = Integer.parseInt(bank.charAt(i) + "");
        if (secondInt > maxSecond) {
          maxSecond = secondInt;
          secondIndex = i;
        }
      }
    }
    for (int i = secondIndex + 1; i < bank.length() - 9; i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int thirdInt = Integer.parseInt(bank.charAt(i) + "");
        if (thirdInt > maxThird) {
          maxThird = thirdInt;
          thirdIndex = i;
        }
      }
    }
    for (int i = thirdIndex + 1; i < bank.length() - 8; i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int fourthInt = Integer.parseInt(bank.charAt(i) + "");
        if (fourthInt > maxFourth) {
          maxFourth = fourthInt;
          fourthIndex = i;
        }
      }
    }
    for (int i = fourthIndex + 1; i < bank.length() - 7; i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int fifthInt = Integer.parseInt(bank.charAt(i) + "");
        if (fifthInt > maxFifth) {
          maxFifth = fifthInt;
          fifthIndex = i;
        }
      }
    }
    for (int i = fifthIndex + 1; i < bank.length() - 6; i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int sixthInt = Integer.parseInt(bank.charAt(i) + "");
        if (sixthInt > maxSixth) {
          maxSixth = sixthInt;
          sixthIndex = i;
        }
      }
    }
    for (int i = sixthIndex + 1; i < bank.length() - 5; i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int seventhInt = Integer.parseInt(bank.charAt(i) + "");
        if (seventhInt > maxSeventh) {
          maxSeventh = seventhInt;
          seventhIndex = i;
        }
      }
    }
    for (int i = seventhIndex + 1; i < bank.length() - 4; i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int eighthInt = Integer.parseInt(bank.charAt(i) + "");
        if (eighthInt > maxEighth) {
          maxEighth = eighthInt;
          eighthIndex = i;
        }
      }
    }
    for (int i = eighthIndex + 1; i < bank.length() - 3; i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int ninthInt = Integer.parseInt(bank.charAt(i) + "");
        if (ninthInt > maxNinth) {
          maxNinth = ninthInt;
          ninthIndex = i;
        }
      }
    }
    for (int i = ninthIndex + 1; i < bank.length() - 2; i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int tenthInt = Integer.parseInt(bank.charAt(i) + "");
        if (tenthInt > maxTenth) {
          maxTenth = tenthInt;
          tenthIndex = i;
        }
      }
    }
    for (int i = tenthIndex + 1; i < bank.length() - 1; i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int eleventhInt = Integer.parseInt(bank.charAt(i) + "");
        if (eleventhInt > maxEleventh) {
          maxEleventh = eleventhInt;
          eleventhIndex = i;
        }
      }
    }
    for (int i = eleventhIndex + 1; i < bank.length(); i++) {
      if (Character.isDigit(bank.charAt(i))) {
        int twelfthInt = Integer.parseInt(bank.charAt(i) + "");
        if (twelfthInt > maxTwelfth) {
          maxTwelfth = twelfthInt;
        }
      }
    }
    sumJoltage += ((long)((maxFirst * Math.pow(10, 11)) + (maxSecond * Math.pow(10, 10))
        + (maxThird * Math.pow(10, 9)) + (maxFourth * Math.pow(10, 8))
        + (maxFifth * Math.pow(10, 7)) + (maxSixth * Math.pow(10, 6))
        + (maxSeventh * Math.pow(10, 5)) + (maxEighth * Math.pow(10, 4))
        + (maxNinth * Math.pow(10, 3)) + (maxTenth * Math.pow(10, 2))
        + (maxEleventh * Math.pow(10, 1)) + (maxTwelfth * Math.pow(10, 0))));
  }

  public long getSumJoltage() {
    return sumJoltage;
  }
}
