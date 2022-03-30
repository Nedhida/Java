public class Echo {
  public static void main(String[] args) {
    int i = 0;
    while (i < args.length) {
      System.out.println(args[i] + " ");
      i++;
    }
    System.out.println();
  }
}
// コンソール画面に入力した内容を出力してくれる
// (例)
// $ Echo(クラス名)　this is a test
// this is a test の部分がコマンドライン引数としてargs[]に順番に格納される
// args[0] = this;
// args[1] = is;
// args[2] = a;
// args[3] = test;
// while文の　i < args.lenghtで配列の長さまで繰り返し処理する
// this is a test を出力