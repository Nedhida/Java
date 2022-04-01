public class Factorial {
  // xの階乗を計算し、その値を返す
  // static変数 インスタンス化の影響を受けない変数
  public static int factorial(int x) {
    if (x < 0)
      // ↓ 例外を投げて処理を抜ける
      throw new IllegalArgumentException("xは0以上でなければいけません");
    int fact = 1;
    for (int i = 2; i <= x; i++)
      fact *= i; // fact = fact * i;と同義
    return fact; // 値を返す
  }

  // 簡単なテストプログラム
  // mainメソッドはプログラムが実行されると最初に動く部分（インスタンス化不可）
  public static void main(String[] args) {
    for (int i = 0; i <= 12; i++)
      System.out.println(i + "の階乗は" + factorial(i) + "です。");
  }
}

// 12!ぐらいまでしか正しく計算できない
// int型の扱える整数の範囲は
// -2147483648～+2147483647までの為