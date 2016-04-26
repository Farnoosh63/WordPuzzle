import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {


  @Test
public void runWordPuzzle_getInputReturnSame_true() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  String userTyped = "tst";
  assertEquals(true, testWordPuzzle.runWordPuzzle(userTyped) instanceof String);
  }

  @Test
public void runWordPuzzle_getInputReturnCaseSensitive_userTyped() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  assertEquals("tSt", testWordPuzzle.runWordPuzzle("tSt"));
  }


    @Test
  public void runWordPuzzle_getInputAllVowelUpperReturnAllHyphen_userTyped() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String userTyped = "AOI";
    assertEquals("---", testWordPuzzle.runWordPuzzle(userTyped));
    }


    @Test
  public void runWordPuzzle_getInputAllVowelLowerReturnAllHyphen_userTyped() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String userTyped = "iui";
    assertEquals("---", testWordPuzzle.runWordPuzzle(userTyped));
    }


    @Test
  public void runWordPuzzle_getInputAllVowelAllCaseReturnAllHyphen_userTyped() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String userTyped = "uUEeaAiIooO";
    assertEquals("-----------", testWordPuzzle.runWordPuzzle(userTyped));
    }


    @Test
  public void runWordPuzzle_getInputReplaceOneVowelWithHyphen_userTyped() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String userTyped = "tEst";
    assertEquals("t-st", testWordPuzzle.runWordPuzzle(userTyped));
    }


    @Test
  public void runWordPuzzle_getInputReplaceAllVowelWithHyphen_userTyped() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String userTyped = "tEase";
    assertEquals("t--s-", testWordPuzzle.runWordPuzzle(userTyped));
    }


    @Test
  public void runWordPuzzle_getInputReplaceAllVowelSentenceWithHyphen_userTyped() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String userTyped = "tEase In mind";
    assertEquals("t--s- -n m-nd", testWordPuzzle.runWordPuzzle(userTyped));
    }

}
