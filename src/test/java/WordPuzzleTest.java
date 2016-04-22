import org.junit.*;
import static org.junit.Assert.*;
// import java.util.ArrayList;

public class WordPuzzleTest {

/*the app gets the userTyped with no vowel and returns the same, this test check if the method receive the input */
  @Test
public void runWordPuzzle_getInputReturnSame_userTyped() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  // String userTyped = new String();
  //  userTyped.add("test");
  assertEquals("tst", testWordPuzzle.runWordPuzzle("tst"));
  }

// /*the app gets the userTyped with no vowel and returns the same in lowercase, this test check if the method receive the input and change the string to all lowercase*/
//   @Test
// public void runWordPuzzle_getInputReturnSameLowerCase_userTyped() {
//   WordPuzzle testWordPuzzle = new WordPuzzle();
//   assertEquals("tst", testWordPuzzle.runWordPuzzle("tSt"));
//   }

/*the app gets the userTyped with one vowel and check if the method receive the input and replace the vowel to hyphen*/
  @Test
public void runWordPuzzle_getInputReplaceOneVowelWithHyphen_userTyped() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  String userTyped = "tEst";
  assertEquals("t-st", testWordPuzzle.runWordPuzzle(userTyped));
  }

  /*the app gets the userTyped with multiple vowels and check if the method receive the input and replaceall the vowels to hyphen*/
    @Test
  public void runWordPuzzle_getInputReplaceAllVowelWithHyphen_userTyped() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String userTyped = "tEase";
    assertEquals("t--s-", testWordPuzzle.runWordPuzzle(userTyped));
    }

}
