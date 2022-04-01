public class Factorial3 {
  // この配列に0!から21!をキャッシュ
  static long[] table = new long[21];
  // 配列の第一要素を初期化
  static {
    table[0] = 1;
  } // 0の階乗は１
  // 初期化が完了した配列要素のインデクスの最大値
  static int last = 0;

  public static long factorial(int x) throws IllegalArgumentException {
    // xが大きすぎたり小さすぎないか検査し、問題があれば例外を投げます。
    if (x >= table.length) // .lengthは配列の大きさを返します。
      throw new IllegalArgumentException("xは大きすぎます。");
    if (x < 0)
      throw new IllegalArgumentException("xが負の値です");

    // 階乗を計算し、結果をキャッシュ用配列に保存する
    while (last < x) {
      table[last + 1] = table[last] * (last + 1);
      last++;
    }
    // キャッシュ用配列からxの階乗を返す
    return table[x];
  }

  // 簡単なテストプログラム
  public static void main(String[] args) {
    System.out.println("20の階乗は" + factorial(20) + "です。");
    System.out.println("15の階乗は" + table[15] + "です。");
  }
}
// 20までの階乗の値はすでにキャッシュされているので
// 15の階乗を求める部分では新しく演算せずに前の処理から呼び出している
