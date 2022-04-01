public class Factorial {
  // xの階乗を計算し、その値を返します。
  public static int factorial(int x) {
    if (x < 0)
      throw new IllegalArgumentException("xは0以上でなければいけません");
    int fact = 1;
    for (int i = 2; i <= x; i++)
      fact *= i;
    return fact;
  }

  // 簡単なテストプログラムです。
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++)
      System.out.println(i + "の階乗は" + factorial(i) + "です。");
  }
}