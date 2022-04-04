
//このサンプルで使う他のいくつかのクラスをインポートします
//インポートされたクラスは、完全名を指定する必要はありません
import java.math.BigInteger; //java.mathパッケージからBigIntegerをインポートします
import java.util.*; //java.utilから(ArrayListを含む)すべてのクラスをインポートします

/**
 * このバージョンでは、任意の整数が使えます。計算できる値の上限はありません。固定サイズの
 * 配列ではなく、ArrayListオブジェクトに計算結果をキャッシュします。ArrayListは配列に似
 * ていますが、任意の大きさに拡張できます。factorial()メソッドはsynchronizedで宣言され
 * ているので、マルチスレッドプログラムから安全に利用できます。このコードを読むときは、
 * java.math.BigIntegerとjava.util.ArrayListを参照してください。
 */
public class Factorial4 {
  protected static ArrayList table = new ArrayList();
  static { // 最初の要素を初期化します。0!は1なので、値は1です。
    table.add(BigInteger.valueOf(1));
  }

  /**
   * factorial()メソッドです。ArrayListにキャッシュされているBigIntegerを
   * 使います。
   */
  public static synchronized BigInteger factorial(int x) {
    if (x < 0)
      throw new IllegalArgumentException("xは0以上でなければいけません");
    for (int size = table.size(); size <= x; size++) {
      BigInteger lastfact = (BigInteger) table.get(size - 1);
      BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
      table.add(nextfact);
    }
    return (BigInteger) table.get(x);
  }

  public static void main(String[] args) {
    for (int i = 0; i <= 50; i++) {
      System.out.println(i + "! = " + factorial(i));
    }
  }
}