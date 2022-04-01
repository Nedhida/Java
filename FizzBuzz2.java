public class FizzBuzz2 {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      // switch(式)の結果を{}内のcase文で当てはまるかを検証
      switch (i % 35) {
        case 0:
          System.out.print("fizzbuzz ");
          // ↓ switch文から抜け出している。
          // ないとdefault処理も行なってしまい34 fizzbuzz 35 ...となるらしい（ならなかった...）
          break;
        case 5:
        case 10:
        case 15:
        case 20:
        case 25:
        case 30:
          System.out.print("fizz ");
          break;
        case 7:
        case 14:
        case 21:
        case 28:
          System.out.print("buzz ");
          break;
        // ↓ 結果に関係なく行う処理
        // 書かないとcaseに当てはまる時のみ処理を行うらしい（そんな事なかった...）
        default:
          System.out.print(i + " ");
          break;
      }
    }
    System.out.println();
  }
}
