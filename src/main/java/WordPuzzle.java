import java.util.HashMap;

public class WordPuzzle {

  public static String runWordPuzzle(String word){

    char[] myWordChars = word.toCharArray(); //for example: test -> [t,E,s,t]

    for(char vowel : myWordChars){
      //vowel case sensitivity
      if (vowel == 'a' || vowel == 'A'|| vowel == 'e'|| vowel == 'E'|| vowel == 'i' || vowel == 'I'|| vowel == 'o'|| vowel == 'O'|| vowel == 'u'|| vowel == 'U'){
        word = word.replaceAll("[aeiouAEIOU]","-");
      }
    } //end of for loop

    return word;
  }
}
