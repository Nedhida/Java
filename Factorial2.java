public class Factorial2 {
  public static long factorial(long x) {
    if (x < 0)
      throw new IllegalArgumentException("xは0以上でなければいけません。");
    if (x <= 1)
      return 1; // ここで再帰を停止
    else
      return x * factorial(x - 1); // 自分自身を再帰的に呼ぶ
  }

  // 簡単なテストプログラム
  public static void main(String[] args) {
    System.out.println("15の階乗は" + factorial(15) + "です。");
  }

}
