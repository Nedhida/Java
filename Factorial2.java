public class Factorial2 {
  public static long factorial(long x) {
    if (x < 0)
      throw new IllegalArgumentException("xは0以上でなければいけません。");
    if (x <= 1)
      // 再帰処理とはメソッドの中で自分自身を呼び出す処理のこと
      return 1; // ここで再帰を停止
    else
      // factorial()メソッド自身が与えられたパラメータxを１小さくして
      return x * factorial(x - 1); // 自分自身を再帰的に呼ぶ
  }

  // 簡単なテストプログラム
  public static void main(String[] args) {
    System.out.println("15の階乗は" + factorial(15) + "です。");
  }

}

// int型より広いlong型により15の階乗の計算も可能

// 再帰処理の流れ
//  例 xが５の時
// if (x <= 1) には当てはまらず else の処理へ
// x * factorial(x - 1) の factorial(x - 1)の部分でfactorialメソッドが呼び出される
// x = 5 の為 5 * factorial(5 - 1) で 5 * factorial(4)となる
// 一旦、x=5の処理が終わった

// factorial(4)メソッドの処理が行われる(5の時と同様の流れ)
// 4 * factorial(4 - 1) となる
// 一旦、xが４の時の処理が終わる

// xが５の時の処理結果とxが４の時の処理内容を合わせると
// 5 * 4 * factorial(4-1)となる

// 『5 * factorial(5-1)』の中の factorial(5-1)の部分に
// 4 * factorial(4-1)を代入して 5 * 4 * factorial(4-1)となる
// メソッドが呼び出されなくなるまで処理を繰り返す

// factorial(1)メソッドの処理 => メソッドの呼び出しが終わる
// return 1 なので処理結果は１で呼び出されるメソッドはなく処理が終わる

// 最終的に処理結果を合わせると1 * 2 * 3 * 4 * 5 となる

// returnでfactorial()メソッドに処理結果の計算結果を返す
// factorial()メソッドが計算結果の120を持っているということになる