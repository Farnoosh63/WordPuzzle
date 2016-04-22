import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

/*the app gets the userTyped with no vowel and returns the same, this test check if the method receive the input */
  @Test
public void runWordPuzzle_getInputReturnSame_true() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  String userTyped = "tst";
  assertEquals(true, testWordPuzzle.runWordPuzzle(userTyped) instanceof String);
  }

/*the app gets the userTyped including uppercase and lowercase and returns the same constants, this test check a case sensitive method*/
  @Test
public void runWordPuzzle_getInputReturnCaseSensitive_userTyped() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  assertEquals("tSt", testWordPuzzle.runWordPuzzle("tSt"));
  }

  /*the app gets the userTyped all vowels uppercase and returns hyphen, this test check the method for if works*/
    @Test
  public void runWordPuzzle_getInputAllVowelUpperReturnAllHyphen_userTyped() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String userTyped = "AOI";
    assertEquals("---", testWordPuzzle.runWordPuzzle(userTyped));
    }

  /*the app gets the userTyped all vowels lowercase and returns hyphen, this test check the method for if works*/
    @Test
  public void runWordPuzzle_getInputAllVowelLowerReturnAllHyphen_userTyped() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String userTyped = "iui";
    assertEquals("---", testWordPuzzle.runWordPuzzle(userTyped));
    }

  /*the app gets the userTyped all vowels both lower and uppercase in one word and returns hyphen, this test check the method for if works*/
    @Test
  public void runWordPuzzle_getInputAllVowelAllCaseReturnAllHyphen_userTyped() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String userTyped = "uUEeaAiIooO";
    assertEquals("-----------", testWordPuzzle.runWordPuzzle(userTyped));
    }

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

    /*the app gets the userTyped with multiple vowels in a sentence and check if the method receive the input and replaceall the vowels to hyphen */
      @Test
    public void runWordPuzzle_getInputReplaceAllVowelSentenceWithHyphen_userTyped() {
      WordPuzzle testWordPuzzle = new WordPuzzle();
      String userTyped = "tEase In mind";
      assertEquals("t--s- -n m-nd", testWordPuzzle.runWordPuzzle(userTyped));
      }

}
