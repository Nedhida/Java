public class Rot13Input {
    public static void main(String[] args) throws IOException{
        //ユーザからのテキスト行を読むためにBufferedReaderを設定します。
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(;;){ //無限ループ
            System.out.print("> "); //プロンプトを表示します。
            String line = in.readLine(); //1行読みます。
            if((line == null) || line.equals("quit")) //EOFあるいは"quit"の場合
                break; //ループから抜け出します。
            StringBuffer buf = new StringBuffer(line); //StringBufferを使います。
            for(int i = 0; i < buf.length(); i++) //各文字に対して、
                buf.setCharAt(i, rot13(buf.charAt(i))); //暗号化したものを保存
            System.out.println(buf); //暗号化された行を表示します。
        }
    }
    
    /**
     * このメソッドはRot13という暗号化を実行します。各文字を13個後の文字で置き換えます。
     * Latinコードのアルファベットは26文字なので、このメソッドは符号化(暗号化)にも復号
     * 化にも使えます。
     */
    public static char rot13(char c){
        if((c >= 'A') && (c <= 'Z')){ //大文字の場合、
            c += 13; //各文字を13個後の文字で置き換えます。
            if(c > 'Z') c -= 26; //Zより大きくなったら、26だけ減算します。
        }
        if((c >= 'a') && (c <= 'z')){ //小文字についても同様です。
            c += 13; 
            if(c > 'z') c -= 26; 
        }
        return c; //変換後の文字列を返します。
    }

}