public class FactQuoter {
  public static void main(String[] args) throws IOException{
      //ユーザのテキスト入力を読むために、BufferedReaderを設定します。
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      //無限ループです。
      for(;;){
          //ユーザにプロンプトを表示します。
          System.out.print("FactQuoter> ");
          //ユーザが入力した行を読みます。
          String line = in.readLine();
          //ファイルの終わりになったか、あるいはユーザがquitをタイプした場合、
          //入力行を解析し、階乗を計算して、結果を表示します。
          try{
              int x = Integer.parseInt(line);
              System.out.println(x + "! = " + Factorial4.factorial(x));
          }
          //何か問題が発生したら、エラーメッセージを表示します。
          catch(Exception e) { System.out.println("Invalid Input"); }
      }
  }
}