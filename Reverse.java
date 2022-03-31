// コマンドライン引数を逆向きに表示させる

public class Reverse {
  public static void main(String[] args) {
    // 引数の配列を後ろからループ
    for (int i = args.length - 1; i >= 0; i--) {
      // 各引数の文字を後ろからループ
      for (int j = args[i].length() - 1; j >= 0; j--) {
        // i番目の引数のj番目の文字を表示
        System.out.print(args[i].charAt(j));
      }
      System.out.print(" ");
    }
    System.out.println();
  }
}

// java Reverse this is a test とターミナルに入力すると
// tset a si siht と出力される