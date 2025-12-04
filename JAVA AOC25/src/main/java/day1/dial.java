package main.java.day1;

public class dial {
  private int value = 50;
  private int code = 0;

  public dial() {}

  private void right(int degrees) {
    value += degrees;
    while (value > 99) {
      value -= 100;
    }
    if (value == 0) {
      code++;
    }
  }

  private void left(int degrees) {
    value -= degrees;
    while (value < 0) {
      value += 100;
    }
    if (value == 0) {
      code++;
    }
  }

  private void oneRight(int degrees) {
    for (int i = 0; i < degrees; i++) {
      value += 1;
      if (value > 99) {
        value -= 100;
      }
      if (value == 0) {
        code++;
      }
    }
  }

  private void oneLeft(int degrees) {
    for (int i = 0; i < degrees; i++) {
      value -= 1;
      if (value < 0) {
        value += 100;
      }
      if (value == 0) {
        code++;
      }
    }
  }

  public void followDirection(String direction) {
    String modDirection = direction.replace("R","");
    modDirection = modDirection.replace("L","");
    int degrees = Integer.parseInt(modDirection);
    switch (direction.charAt(0)) {
//      case 'R' -> right(degrees);
//      case 'L' -> left(degrees);
      case 'R' -> oneRight(degrees);
      case 'L' -> oneLeft(degrees);
    }
  }

  public int getCode() {
    return code;
  }
}
