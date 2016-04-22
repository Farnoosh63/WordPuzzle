import java.util.ArrayList;
import java.util.HashMap;

public class WordPuzzle {

  public static String runWordPuzzle(String word){
    // String newWord = new String(word);
    // newWord=word.toLowerCase(); //tEst -> test

    // String result = newWord.replace('e','-'); //"t-st"
    char[] myWordChars = word.toCharArray(); //test -> [t,E,s,t]
    // String ifIsVowel = myWordChars.toString();
    // String methodResult = "";

    for(char vowel : myWordChars){
      //vowel case sensitivity
      if (vowel == 'a' || vowel == 'A'|| vowel == 'e'|| vowel == 'E'|| vowel == 'i' || vowel == 'I'|| vowel == 'o'|| vowel == 'O'|| vowel == 'u'|| vowel == 'U'){
        word = word.replaceAll("[aeiouAEIOU]","-");

      // }else {
      //   word=word;
      }
    } //end of for loop

    return word;
  }
}
