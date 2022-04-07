public class FactComputer {
  public static void main(String[] args){
      //階乗の計算を実行します。
      //何か問題が発生したら、catch節で処理します。
      try{
          int x = Integer.parseInt(args[0]);
          System.out.println(x + "! = " + Factorial4.factorial(x));
      }
      //引数が指定されなかった場合、args[0]が未定義になるので、例外が投げられます。
      catch(ArrayIndexOutOfBoundsException e){
          System.out.println("You must specify an argument");
          System.out.println("Usage: java FactComputer ");
      }
      //引数が数値でない場合、Integer.parseInt()が例外を投げます。
      catch(NumberFormatException e){
          System.out.println("The argument you specify must be an integer");
      }
      //引数が負の数値だった場合、Factorial4.factorial()が例外を投げます。
      catch(IllegalArgumentException e){
          //factorial()メソッドが送信するメッセージを表示します。
          System.out.println("Bad argument: " + e.getMessage());
      }
  }
}