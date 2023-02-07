import java.io.*;
import java.util.*;

public class Serafini {
    String w1,w2;
    int wLen;
    File dict;

    public Serafini(String word1, String word2, String dictionaryName){
        w1 = word1;
        w2 = word2;
        if(w1.length() == w2.length()){
            wLen = w1.length();
        }
        else{
            wLen = 0;
        }
        dict =new File(dictionaryName);

    }

    public void dictPrint(String dictName){
        Scanner words = new Scanner(dictName);
        while(words.hasNextLine()){
            String res = words.nextLine();
            System.out.print(res);
        }
    }

}
