import java.util.ArrayList;
//import java.util.HashMap;

public class WordPuzzle {

  public static String runWordPuzzle(String word){
    String newWord = new String();
    // newWord=word.toLowerCase(); //tEst -> test

    // String result = newWord.replace('e','-'); //"t-st"
    char[] myWordChars = newWord.toCharArray(); //test -> [t,E,s,t]
    // String ifIsVowel = myWordChars.toString();
    String result = "";
    for(char vowel : myWordChars.toLowerCase()){
      if (vowel == 'a' || vowel == 'e'|| vowel == 'i'|| vowel == 'o'|| vowel == 'u'){
        result = newWord.replaceAll("[aeiou]","-");
        result = newWord.replaceAll("[AEIOU]","-");
      }else {
        result = word;
      }
    } //end of for loop

    return result;
  }
}
