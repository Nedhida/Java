public class FizzBuzz {
  public static void main(String[] args) {

    // for文による繰り返し処理 int i = 1 で int型の変数iを定義、1で初期化
    // i <= 100 で処理回数を定義 i++で処理後に変数iのカウントを＋１する演算子
    for (int i = 1; i <= 100; i++) {
      if ((i % 5 == 0) && (i % 7 == 0))
        // 変数i➗5 =0かつ変数i➗７=0の時の処理
        System.out.print("FizzBuzz");
      else if (i % 5 == 0)
        // 変数i➗5 =0時の処理
        System.out.print("Fizz");
      else if (i % 7 == 0)
        // 変数i➗７=0の時の処理
        System.out.print("Buzz");
      else
        // それ以外の時の処理
        System.out.print(i);
      // 処理ごとのスペース
      System.out.print(" ");
    }
    System.out.println();
  }
}
