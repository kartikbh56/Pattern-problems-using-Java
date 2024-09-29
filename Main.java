public class Main {
  public static void main(String[] args) {
    pattern1(5);
    pattern2(5);
    pattern3(5);
    pattern4(5);
    pattern5(5);
    pattern6(5);
    pattern7(5);
    pattern8(5);
    pattern9(5);
    pattern10(5);
    pattern11(5);
    pattern12(5);
    pattern13(5);
    pattern14(5);
    pattern15(5);
    pattern16(5);
    pattern17(5);
    pattern18(5);
    pattern19(5);
    pattern20(5);
    pattern21(5);
    pattern22(6);
    pattern23(5);
  }

  static void pattern1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        System.out.print("*");
      System.out.println();
    }
  }

  static void pattern2(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++)
        System.out.print("*");
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print(j);
      System.out.println();
    }
  }

  static void pattern4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print(i);
      System.out.println();
    }
  }

  static void pattern5(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++)
        System.out.print("*");
      System.out.println();
    }
  }

  static void pattern6(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  static void pattern7(int n) {
    for (int i = 0; i < n; i++) {
      for (int s = 0; s < n - i - 1; s++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i * 2 + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern8(int n) {
    for (int i = n; i > 0; i--) {
      for (int s = 0; s < n - i; s++)
        System.out.print(" ");
      for (int j = 0; j < i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern9(int n) {
    for (int i = 1; i <= 2 * n - 1; i++) {
      int stars = i;
      if (i > n)
        stars = 2 * n - i;
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern10(int n) {
    for (int i = 1; i <= n; i++) {
      int start = i % 2 == 0 ? 0 : 1;
      for (int j = 1; j <= i; j++) {
        System.out.print(start);
        start = 1 - start;
      }
      System.out.println();
    }
  }

  static void pattern11(int n) {
    int spaces = 2 * n - 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      for (int s = 1; s < spaces; s++) {
        System.out.print(" ");
      }
      for (int j = i; j > 0; j--) {
        System.out.print(j);
      }
      spaces -= 2;
      System.out.println();
    }
  }

  static void pattern12(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num++ + " ");
      }
      System.out.println();
    }
  }

  static void pattern13(int n) {
    int num = 65;
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print((char) (num + j));
      }
      System.out.println();
    }
  }

  static void pattern14(int n) {
    int num = 65;
    for (int i = n; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print((char) (num + j));
      }
      System.out.println();
    }
  }

  static void pattern15(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) (65 + i));
      }
      System.out.println();
    }
  }

  static void pattern16(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++)
        System.out.print(j);
      for (int j = i - 1; j > 0; j--)
        System.out.print(j);
      System.out.println();
    }
  }

  static void pattern17(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++)
        System.out.print((char) (j + 64));
      for (int j = i - 1; j > 0; j--)
        System.out.print((char) (j + 64));
      System.out.println();
    }
  }

  static void pattern18(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = i; j >= 1; j--) {
        System.out.print((char) (64 + n - j + 1) + " ");
      }
      System.out.println();
    }
  }

  // practice
  static void pattern19(int n) {
    // 1
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    // 1 inverted
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    System.out.println();

    // 2
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(n - j + 1);
      }
      System.out.println();
    }
    // 2 inverted
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(n - j + 1);
      }
      System.out.println();
    }

    System.out.println();

    // 3
    for (int i = 1; i <= n; i++) {
      for (int j = i; j >= 1; j--) {
        System.out.print(n - j + 1);
      }
      System.out.println();
    }
    // 3 inverted
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print(j);
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 1; i <= n; i++) {
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print(n - j + 1);
      }
      System.out.println();
    }

    System.out.println();

    int num = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num++);
      }
      System.out.println();
    }
  }

  static void pattern20(int n) {
    for (int i = 1; i <= n * 2; i++) {
      int stars = i > n ? i - n : n - i + 1;
      int spaces = 2 * (n - stars);
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      for (int s = 0; s < spaces; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern21(int n) {
    for (int i = 1; i <= n * 2; i++) {
      int stars = i > n ? 2 * n - i : i;
      int spaces = 2 * (n - stars);
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      for (int s = 1; s <= spaces; s++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void pattern22(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n || j == n)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }

  static void pattern23(int n) {
    for (int i = 1; i < n * 2; i++) {
      for (int j = 1; j < n * 2; j++) {
        if (i == 1 || j == 1 || i == n * 2 - 1 || j == n * 2 - 1)
          System.out.print(n);
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }

}
