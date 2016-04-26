import java.util.HashMap;

public class WordPuzzle {

  public static String runWordPuzzle(String word){

        word = word.replaceAll("[aeiouAEIOU]","-");

    return word;
  }

}
