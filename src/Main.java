import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Word Ladder.\n" + "Please give me two English words, and I will change the\nfirst into the second by changing one letter at a time.");
        Scanner hi = new Scanner(System.in);
        System.out.println("But first I need to know the name of the dictionary file you would like to use");
        String dicName = hi.next();
        System.out.print("What is the first word");
        String word1 = hi.next();
        System.out.print("What is the second word");
        String word2 = hi.next();
        Serafini test = new Serafini(word1,word2,dicName);
        test.dictPrint(dicName);
    }
}